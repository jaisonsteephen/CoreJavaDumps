package com.java8.stream;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FlatmapDemo {
	public static void main(String args[]) {
		List<Zoo> zooList = new ArrayList<>();
		
		Zoo delhiZoo = new Zoo("Delhi");
		delhiZoo.add("Lion");
		delhiZoo.add("Tiger");

		Zoo trivandrumZoo = new Zoo("Trivandrum");
		trivandrumZoo.add("Peacock");
		trivandrumZoo.add("Camelion");

		zooList.add(delhiZoo);
		zooList.add(trivandrumZoo);

		// to get the aggregate
		List<String> animalList = zooList.stream().flatMap(zooo -> zooo.getAnimals().stream()).collect(Collectors.toList());
		System.out.println(animalList);

		// to get the unique set
		Set<String> animalSet = zooList.stream().flatMap(element -> element.getAnimals().stream()).collect(Collectors.toSet());
		System.out.println(animalSet);

	}
}

class Zoo {
	private String zooName;
	private Set<String> animals;

	public Zoo(String zooName) {
		this.zooName = zooName;
		this.animals = new HashSet<>();
	}

	public void add(String animal) {
		this.animals.add(animal);
	}

	public Set<String> getAnimals() {
		return animals;
	}
}
