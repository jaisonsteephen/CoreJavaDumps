package com.thread;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class RNG implements Runnable {
	private Random random = new Random();
	private int count;
	private CyclicBarrier barrier;
	private List<Integer> randomNumbers = new ArrayList<Integer>();

	public List<Integer> getResult() {
		return randomNumbers;
	}

	public RNG(int count, CyclicBarrier barrier) {
		this.count = count;
		this.barrier = barrier;
	}

	public void run() {
		randomNumbers.clear();
		for (int i = 1; i <= count; i++) {
			randomNumbers.add(Math.abs(random.nextInt(100)));
		}
		try {
			System.out.println("barrier wait-----------------------------");
			barrier.await();
			System.out.println("barrier finish-----------------------------");
		} catch (InterruptedException e) {
			randomNumbers.clear();
		} catch (BrokenBarrierException e) {
			randomNumbers.clear();
		}
	}
}

class RandomNumberAssembler implements Runnable {
	private List<RNG> rngs;

	public RandomNumberAssembler(List<RNG> rngs) {
		this.rngs = rngs;
	}

	public void run() {
		System.out.println("Random numbers.............");
		for (RNG rng : rngs) {
			for (Integer randomNumber : rng.getResult()) {
				System.out.println(randomNumber);
			}
		}
	}
}

public class CyclicBarrierDemo {
	public static void main(String[] args) {
		// generate 20 random numbers using 4 threads twice
		final int THREAD_COUNT = 4;
		final int RANDOM_NUMBER_PER_THREAD_COUNT = 5;
		final int TASK_COUNT = 2;

		List<RNG> rngs = new ArrayList<RNG>();
		RandomNumberAssembler assembler = new RandomNumberAssembler(rngs);
		CyclicBarrier barrier = new CyclicBarrier(THREAD_COUNT, assembler);
		for (int i = 1; i <= THREAD_COUNT; i++) {
			rngs.add(new RNG(RANDOM_NUMBER_PER_THREAD_COUNT, barrier));
		}
		ExecutorService service = Executors.newFixedThreadPool(THREAD_COUNT);

		for (int k = 1; k <= TASK_COUNT; k++) {
			for (int i = 1; i <= THREAD_COUNT; i++) {
				service.submit(rngs.get(i - 1));
			}
		}
		service.shutdown();
	}
}