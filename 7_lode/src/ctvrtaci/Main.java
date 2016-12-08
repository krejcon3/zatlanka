package ctvrtaci;


import java.util.Random;
import java.util.Scanner;


public class Main {


	static int rozmer = 8;
	static String[][] hrac = new String[rozmer][rozmer];
	static String[][] pocitac = new String[rozmer][rozmer];


	public static void main(String[] args) {
		hrac = generujTabulku(rozmer);
		pocitac = generujTabulku(rozmer);
		vypisTabulku(hrac, "Hráč");


		int[] coords = zadejSouradnice();
		hrac = lodMala(hrac, coords[0], coords[1]);
		vypisTabulku(hrac, "Hráč");


		vypisTabulku(pocitac, "Počítač");
		System.out.println();


		// TADY HRAJEME
		hrac = strel(hrac, 5, 3);
		hrac = strel(hrac, 2, 2);


		vypisTabulku(hrac, "Hráč");
		vypisTabulku(pocitac, "Počítač");
	}


	private static int[] zadejSouradnice() {
		System.out.println("Zadejte souřadnice x y");
		Scanner scanner = new Scanner(System.in);
		int[] souradnice = new int[2];
		souradnice[0] = scanner.nextInt();
		souradnice[1] = scanner.nextInt();
		return souradnice; // vraci [x, y]
	}

	private static int[] generujSouradnice(int limit) {
		Random random = new Random();
		int[] souradnice = new int[2];
		souradnice[0] = random.nextInt(limit); // nextInt(limit) vrací náhodné číslo n, n >= 0 && n < limit - n je větší nebo rovno nule a zároven menší než limit
		souradnice[1] = random.nextInt(limit);
		return souradnice;
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
		if (x < tabulka.length || x < 1 || y < tabulka.length - 2 || y < 0) {
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
			System.out.println("Jantare");
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




