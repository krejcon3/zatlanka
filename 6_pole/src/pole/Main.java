package pole;

import java.util.Arrays;

/**
 * Created by ondrejkrejcir on 21/11/16.
 */
public class Main {

	private static int points = 0;

	public static void main(String[] args) {
		int passed = 0;
		if (Test.find(new int[] {1, 4}, 4) == 1) {
			System.out.print("OK: ");
			passed++;
		} else {
			System.out.print("ER: ");
		}
		System.out.println("Find for value [{1, 4}, 4]");

		if (Test.find(new int[] {1, 1, 1, 1, 1, 1}, 1) == 0) {
			System.out.print("OK: ");
			passed++;
		} else {
			System.out.print("ER: ");
		}
		System.out.println("Find for value [{1, 4}, 4]");

		if (Test.find(new int[] {1, 2, 3, 4, 5}, 6) < 0) {
			System.out.print("OK: ");
			passed++;
		} else {
			System.out.print("ER: ");
		}
		System.out.println("Find for value [{1, 2, 3, 4, 5}, 6)]");

		if (Test.find(new int[] {10, 88, -10, 400}, -10) == 2) {
			System.out.print("OK: ");
			passed++;
		} else {
			System.out.print("ER: ");
		}
		System.out.println("Find for value [{10, 88, -10, 400}, -10]");

		solveSubTotal("Find", passed, 4, 0);

		passed = 0;

		if (Arrays.equals(Test.sort(new int[] {1, 2, 3, 4, 5}), new int[] {1, 2, 3, 4, 5})) {
			System.out.print("OK: ");
			passed++;
		} else {
			System.out.print("ER: ");
		}
		System.out.println("Sort for value [{1, 2, 3, 4, 5}]");

		if (Arrays.equals(Test.sort(new int[] {5, 4, 3, 2, 1}), new int[] {1, 2, 3, 4, 5})) {
			System.out.print("OK: ");
			passed++;
		} else {
			System.out.print("ER: ");
		}
		System.out.println("Sort for value [{5, 4, 3, 2, 1}]");

		if (Arrays.equals(Test.sort(new int[] {1}), new int[] {1})) {
			System.out.print("OK: ");
			passed++;
		} else {
			System.out.print("ER: ");
		}
		System.out.println("Sort for value [{1}]");

		if (Arrays.equals(Test.sort(new int[] {10, 1, 9, 2, 8, 3, 7, 4, 6, 5}), new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10})) {
			System.out.print("OK: ");
			passed++;
		} else {
			System.out.print("ER: ");
		}
		System.out.println("Sort for value [{10, 1, 9, 2, 8, 3, 7, 4, 6, 5}]");

		solveSubTotal("Sort", passed, 4, 1);

		passed = 0;

		if (Arrays.equals(Test.binaryAdd(new int[] {0, 0, 0}, new int[] {0, 0, 1}), new int[] {0, 0, 1})) {
			System.out.print("OK: ");
			passed++;
		} else {
			System.out.print("ER: ");
		}
		System.out.println("BinaryAdd for value [{0, 0, 0}, {0, 0, 1}]");

		if (Arrays.equals(Test.binaryAdd(new int[] {1, 0, 1}, new int[] {0, 0, 1}), new int[] {1, 1, 0})) {
			System.out.print("OK: ");
			passed++;
		} else {
			System.out.print("ER: ");
		}
		System.out.println("BinaryAdd for value [{1, 0, 1}, {0, 0, 1}]");

		if (Arrays.equals(Test.binaryAdd(new int[] {1, 1, 1}, new int[] {0, 0, 1}), new int[] {0, 0, 0})) {
			System.out.print("OK: ");
			passed++;
		} else {
			System.out.print("ER: ");
		}
		System.out.println("BinaryAdd for value [{1, 1, 1}, {0, 0, 1}]");

		if (Arrays.equals(Test.binaryAdd(new int[] {2}, new int[] {0}), null)) {
			System.out.print("OK: ");
			passed++;
		} else {
			System.out.print("ER: ");
		}
		System.out.println("BinaryAdd for value [{2}, {0}]");

		solveSubTotal("BinaryAdd", passed, 4, 2);

		System.out.println("===========================");
		System.out.printf("== Celkem získáno %d bodů ==\n", points);
		System.out.println("===========================");
	}

	private static void solveSubTotal(String name, int passed, int total, int index) {
		System.out.println();
		System.out.printf("Úloha %s splněna z %d/%d\r\n", name, passed, total);
		int t = total == passed ? index == 2 ? 2 : 1 : 0;
		System.out.printf("Zisk bodů: %d", t);
		points += t;
		System.out.println();
		System.out.println();
	}
}
