package com.immutable;

final class Immutable {
	final private Integer x;

	Immutable(int x) {
		this.x = x;
	}

	public Integer getX() {
		return x;
	}
}

public class ImmutableDemo {

	public static void main(String... strings) {
		Immutable i1 = new Immutable(5);
	}
}
