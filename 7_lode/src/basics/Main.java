package basics;

/**
 * Created by ondrejkrejcir on 02/12/16.
 */
public class Main {


	static int rozmer = 10;
	static String[][] hrac = new String[rozmer][rozmer];
	static String[][] pocitac = new String[rozmer][rozmer];


	public static void main(String[] args) {
		hrac = generujTabulku(rozmer);
		pocitac = generujTabulku(rozmer);
		hrac = lodMala(hrac, 0, 0);
		hrac = lodVelka(hrac, 2, 2);

		vypisTabulku(hrac, "Hráč");
		vypisTabulku(pocitac, "Počítač");
		System.out.println();


		// TADY HRAJEME
		hrac = strel(hrac, 5, 3);
		hrac = strel(hrac, 2, 2);


		vypisTabulku(hrac, "Hráč");
		vypisTabulku(pocitac, "Počítač");
	}


	private static String[][] lodMala(String[][] tabulka, int x, int y) {
		if (x >= tabulka.length || x < 0 || y >= tabulka.length || y < 0) {
			System.out.println("Neplatný tah");
			return tabulka;
		}
		tabulka[x][y] = "@";
		return tabulka;
	}


	private static String[][] lodVelka(String[][] tabulka, int x, int y) {
        if (x >= tabulka.length || x < 1 || y >= tabulka.length - 2 || y < 0) {
            System.out.println("Neplatný tah");
            return tabulka;
        }

		tabulka[x][y] = "@";
		tabulka[x][y + 1] = "@";
		tabulka[x][y + 2] = "@";
		tabulka[x - 1][y] = "@";
		return tabulka;
	}


	private static String[][] strel(String[][] tabulka, int x, int y) {
		if (x >= tabulka.length || x < 0 || y >= tabulka.length || y < 0) {
			System.out.println("Neplatný tah");
			return tabulka;
		}
		if (tabulka[x][y] == "@") {
			tabulka[x][y] = "X";
			System.out.println("Zásah!");
		} else {
			tabulka[x][y] = "O";
			System.out.println("Vedle!");
		}
		return tabulka;
	}


	private static void vypisTabulku(String[][] tabulka, String titulek) {
		System.out.println("=== " + titulek + " ===");
		System.out.print("  ");
		for (int a = 0; a < tabulka[0].length; a++) {
			System.out.print(a + " ");
		}
		System.out.println();


		for (int i = 0; i < tabulka.length; i++) {
			System.out.print(i + " ");
			for (int j = 0; j < tabulka[i].length; j++) {
				System.out.print(tabulka[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
	}

	private static String[][] generujTabulku(int rozmer) {
		String[][] tabulka = new String[rozmer][rozmer];
		for (int i = 0; i < tabulka.length; i++) {
			for (int j = 0; j < tabulka[i].length; j++) {
				tabulka[i][j] = " ";
			}
		}
		return tabulka;
	}
}

