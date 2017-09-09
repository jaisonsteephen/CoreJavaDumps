package com.Error;

import java.io.IOException;

class Parent {
	void show() throws IOException {

	}
}

class Child extends Parent {
	void show() throws Exception {/// cant throw wider exception.... if used IOException, it will be fine

	}
}

public class ExceptionWhileInheriting {
	public static void main() {

	}
}
