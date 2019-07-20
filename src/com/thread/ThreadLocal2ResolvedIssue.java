package com.thread;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class ThreadSafeFormatter2 {
	public static ThreadLocal<SimpleDateFormat> simpleDateFormat = new ThreadLocal<SimpleDateFormat>() {
		@Override
		protected SimpleDateFormat initialValue() {
			return new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
		}

		@Override
		public SimpleDateFormat get() {
			return super.get();
		}
	};

}

public class ThreadLocal2ResolvedIssue {
	private static SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");

	public static void main(String[] args) {
		String dateStr = "2018-06-22T10:00:00";

		ExecutorService executorService = Executors.newFixedThreadPool(10);
		Runnable task = new Runnable() {
			@Override
			public void run() {
				parseDate(dateStr);
			}
		};

		for (int i = 0; i < 100; i++) {
			executorService.submit(task);
		}

		executorService.shutdown();
	}

	private static void parseDate(String dateStr) {
		try {
			simpleDateFormat=ThreadSafeFormatter2.simpleDateFormat.get();
			Date date = simpleDateFormat.parse(dateStr);
			System.out.println("Successfully Parsed Date " + date);
		} catch (ParseException e) {
			System.out.println("ParseError " + e.getMessage());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
