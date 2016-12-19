package ctvrtaci;

import java.util.Random;
import java.util.Scanner;


public class Main {


	static int rozmer = 10;
	static int hracZivoty = 0;
	static int pocitacZivoty = 0;
	static String[][] hrac = new String[rozmer][rozmer];
	static String[][] pocitac = new String[rozmer][rozmer];


	public static void main(String[] args) {
		hrac = generujTabulku(rozmer);
		pocitac = generujTabulku(rozmer);
		System.out.println("Nyní zadává hráč!");
		vypisTabulku(hrac, "Hráč");

		System.out.println("Přidávám malou lod");
		System.out.println("@");
		int[] coords = zadejSouradnice();
		hrac = lodMala(hrac, coords[0], coords[1]);
		hracZivoty += 1;
		vypisTabulku(hrac, "Hráč");

		System.out.println("Přidávám malou lod");
		System.out.println("@");
		coords = zadejSouradnice();
		hrac = lodMala(hrac, coords[0], coords[1]);
		hracZivoty += 1;
		vypisTabulku(hrac, "Hráč");

		System.out.println("Konec zadávání hráče");

		System.out.println("Nyní vygeneruji pole pro PC");
		coords = generujSouradnice(rozmer);
		pocitac = lodMala(pocitac, coords[0], coords[1]);
		pocitacZivoty += 1;
		coords = generujSouradnice(rozmer);
		pocitac = lodMala(pocitac, coords[0], coords[1]);
		pocitacZivoty += 1;
		vypisTabulku(pocitac, "Počítač");
		System.out.println("Konec generování lodí");

		while (pocitacZivoty > 0 && hracZivoty > 0) {
			System.out.println("Střelba!");
			coords = zadejSouradnice();
			strel(false, coords[0], coords[1]);
			coords = generujSouradnice(rozmer);
			strel(true, coords[0], coords[1]);
			vypisTabulku(hrac, "Hráč");
			vypisTabulku(pocitac, "Počítač");
		}

		if (hracZivoty == 0) {
			System.out.println("Vyhrál pocitac");
		}

		if (pocitacZivoty == 0) {
			System.out.println("Vyhral hrac");
		}
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


	private static void strel(boolean isPlayer, int x, int y) {
		String[][] tabulka;
		if (isPlayer) {
			tabulka = hrac;
		} else {
			tabulka = pocitac;
		}
		if (x >= tabulka.length || x < 0 || y >= tabulka.length || y < 0) {
			System.out.println("Neplatný tah");
		}
		switch (tabulka[x][y]) {
			case "@":
				tabulka[x][y] = "X";
				System.out.println("Zásah!");
				if (isPlayer) {
					hracZivoty -= 1;
				} else {
					pocitacZivoty -= 1;
				}
				break;
			case " ":
				tabulka[x][y] = "O";
				System.out.println("Jantare");
				break;
			default:
				System.out.println("Na pozici již bylo střileno");
		}
		if (isPlayer) {
			hrac = tabulka;
		} else {
			pocitac = tabulka;
		}
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


