package com.stream;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FlatmapDemo {
	public static void main(String args[]) {
		List<Zoo> zooList = new ArrayList<>();
		
		Zoo nationalZoo = new Zoo("National");
		nationalZoo.add("Lion");
		nationalZoo.add("Tiger");

		Zoo aCountyZoo = new Zoo("Wills County");
		aCountyZoo.add("Peacock");
		aCountyZoo.add("Camelion");

		zooList.add(nationalZoo);
		zooList.add(aCountyZoo);

		// to get the aggregate
		List<String> animalList = zooList.stream().flatMap(element -> element.getAnimals().stream()).collect(Collectors.toList());
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
