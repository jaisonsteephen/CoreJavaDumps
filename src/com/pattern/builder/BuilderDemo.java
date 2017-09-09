package com.pattern.builder;

class User {
	int age;
	int mark;
	String language;

	public User(Builder builder) {
		this.age = builder.age;
		this.mark = builder.mark;
		this.language = builder.language;
	}

	public static class Builder {
		int age;
		int mark;
		String language;

		Builder age(int age) {
			this.age = age;
			return this;
		}

		Builder mark(int mark) {
			this.mark = mark;
			return this;
		}

		Builder language(String language) {
			this.language = language;
			return this;
		}

		User build() {
			return new User(this);
		}
	}

	public String toString() {
		return "Age:" + age + "Mark:" + mark + "Language:" + language;
	}
}

public class BuilderDemo {
	public static void main(String args[]) {
		User u = new User.Builder().age(10).mark(15).language("english").build();
		System.out.println(u);
	}
}
