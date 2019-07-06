
public class Question1 {

	public static void JavaHungry(Integer s) {
		System.out.println("i");
	}
	public static void JavaHungry(Float s) {
		System.out.println("i");
	}
	public static void JavaHungry(Object o) {
		System.out.println("o");
	}

	public static void main(String args[]) {
		JavaHungry(null);
	}
}
//prints i, since it will go to the specific one