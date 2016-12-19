package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

	private static int rozmer = 10;
	private static String[][] hrac;
	private static String[][] pocitac;

	public static void main(String[] args) {
		hrac = generujPole(rozmer);
		pocitac = generujPole(rozmer);

		vypisPole(hrac, "=== Hráč ===");

		int[] coords = zadejSouradnice();
		hrac = nasadTorpedoborce(hrac, coords[0], coords[1]);

		vypisPole(hrac, "=== Hráč ===");

		coords = zadejSouradnice();
		hrac = nasadPruzkumnika(hrac, coords[0], coords[1]);

		vypisPole(hrac, "=== Hráč ===");
	}

	private static int[] zadejSouradnice() {
		System.out.println("Zadejte souradnice x y [0.." + (rozmer - 1) + "]");
		int[] souradnice = new int[2]; // souradnice[0] - x, souradnice[1] y
		Scanner scanner = new Scanner(System.in);
		souradnice[0] = scanner.nextInt();
		souradnice[1] = scanner.nextInt();
		return souradnice;
	}

	private static int[] generujSouradnice() {
		int[] souradnice = new int[2]; // souradnice[0] - x, souradnice[1] y
		Random random = new Random();
		souradnice[0] = random.nextInt(rozmer);
		souradnice[1] = random.nextInt(rozmer);
		return souradnice;
	}

	private static String[][] strel(String[][] pole, int x, int y) {
		if (x < 0 || y < 0 || x > pole.length - 1 || y > pole.length - 1) {
			System.out.println("Špatný vstup!");
			return pole;
		}
		switch(pole[x][y]) {
			case "@":
				pole[x][y] = "X";
				break;
			case ".":
				pole[x][y] = "O";
				break;
			default:
				System.out.println("Na pole již byla provedena střelba!");
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


