import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class MemoryLeakDemo {
	// public static void main(String[] args) {
	// Long maxMemory = Runtime.getRuntime().maxMemory();
	// System.out.println(maxMemory);
	//
	// int[] matrix = new int[(int) (maxMemory + 1)];
	// }

	public static void main(String[] args) {
		Random random = new Random();
		Map sampleMap = new HashMap();

		// Loop forever...
		while (true) {
			// Create and store a random pair.
			int randomValue = random.nextInt();
			sampleMap.put(randomValue, String.valueOf(randomValue));
		}
	}
}
