package tretaci;


public class Main {


	private static int rozmer = 10;
	private static String[][] hrac;
	private static String[][] pocitac;


	public static void main(String[] args) {
		hrac = generujPole(rozmer);
		pocitac = generujPole(rozmer);


		vypisPole(hrac, "=== Hráč ===");
		vypisPole(pocitac, "=== Počítač ===");


		hrac = nasadTorpedoborce(hrac, 5, 6);
		hrac = strel(hrac, 5, 5);
		hrac = strel(hrac, 5, 4);


		vypisPole(hrac, "=== Hráč ===");
		vypisPole(pocitac, "=== Počítač ===");
	}


	private static String[][] strel(String[][] pole, int x, int y) {
		if (x < 0 || y < 0 || x > pole.length - 1 || y > pole.length - 1) {
			System.out.println("Špatný vstup!");
			return pole;
		}
		if (pole[x][y] == "@") {
			pole[x][y] = "X";
		} else {
			pole[x][y] = "O";
		}
		return pole;
	}




	private static String[][] nasadPruzkumnika(String[][] pole, int x, int y) {
		if (x < 0 || y < 0 || x > pole.length - 1 || y > pole.length - 1) {
			System.out.println("Špatný vstup!");
			return pole;
		}
		pole[x][y] = "@";
		return pole;
	}


	private static String[][] nasadTorpedoborce(String[][] pole, int x, int y) {
		if (x - 1 < 0 || y - 1 < 0 || x > pole.length - 1 || y + 1 > pole.length - 1) {
			System.out.println("Špatný vstup!");
			return pole;
		}
		pole[x][y] = "@";
		pole[x][y - 1] = "@";
		pole[x][y + 1] = "@";
		pole[x - 1][y] = "@";
		return pole;
	}


	private static String[][] generujPole(int rozmer) {
		String[][] pole = new String[rozmer][rozmer];
		for (int i = 0; i < pole.length; i++) {
			for (int j = 0; j < pole[i].length; j++) {
				pole[i][j] = ".";
			}
		}
		return pole;
	}


	private static void vypisPole(String[][] pole, String zprava) {
		System.out.println(zprava);
		System.out.print("  ");
		for (int k = 0; k < pole.length; k++) {
			System.out.print(k + " ");
		}
		System.out.println();
		for (int i = 0; i < pole.length; i++) {
			System.out.print(i + " ");
			for (int j = 0; j < pole[i].length; j++) {
				System.out.print(pole[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println();
	}
}


