package funkce;

public class Main {

	public static void main(String[] args) {

		/*
		 * Testy pro faktorial
		 */
		int[] inputs = new int[] {0, 1, -10, 2, 5, 10};
		int[] outputs = new int[] {1, 1, 0, 2, 120, 3628800};
		for (int i = 0; i < inputs.length; i++) {
			if (Test.faktorial(inputs[i]) == outputs[i]) {
				System.out.println("Faktorial for value " + inputs[i] + ") PASSED");
			} else {
				System.out.println("!! Faktorial for value " + inputs[i] + ") FAILED");
			}
		}
		System.out.println();

		/*
		 * Testy pro fibonacciho posloupnost
		 */
		inputs = new int[] {0, 1, -10, 2, 5, 10};
		outputs = new int[] {1, 1, 0, 2, 8, 89};
		for (int i = 0; i < inputs.length; i++) {
			if (Test.fibonacci(inputs[i]) == outputs[i]) {
				System.out.println("Fibonacci for value " + inputs[i] + ") PASSED");
			} else {
				System.out.println("!! Fibonacci for value " + inputs[i] + ") FAILED");
			}
		}

		/*
		 * Testy pro morseovku
		 */
	}
}
