package pole;

/**
 * Created by ondrejkrejcir on 21/11/16.
 */
public class Test {


	/*
	 * vstup je pole celých čísel a hledané číslo
	 * výstup je PRVNÍ index hledaného čísla v poli (indexujeme od 0)
	 * pokud hledané číslo v poli není bude návratová hodnota menší než nula (záporné číslo)
	 *
	 * hodnoceno za 1b
	 */
	public static int find(int[] array, int a) {
		return -1;
	}

	/*
	 * vstup je pole celých čísel
	 * výstup je pole celých čísel
	 *
	 * na výstupu bude pole seřazeno od nejmenšího po největší
	 *
	 * VSTUP: 1, 0, 4, 5, 3, 2
	 * VÝSTUP: 0, 1, 2, 3, 4, 5
	 *
	 * hodnoceno za 1b
	 */
	public static int[] sort(int[] array) {
		return array;
	}

	/*
	 * vstup jsou dvě pole celých čísel nabývajících hodnot {0, 1}
	 * výstup je pole celých čísel, které bude mít délku delšího z obou polí a bude se rovnat součtu těchto dvou čísel (binární formát)
	 * v případě nevalidního vstupu funkce vrací hodnotu null
	 *
	 * VSTUP: 0, 0, 1 a 0, 0, 1
	 * VÝSTUP: 0, 1, 0
	 *
	 * VSTUP: 1, 1, 1 a 0, 0, 1
	 * VÝSTUP: 0, 0, 0
	 *
	 * VSTUP: 2, 1, 1 a 0, 0, 0
	 * VYSTUP: null
	 *
	 * hodnoceno za 2b
	 */
	public static int[] binaryAdd(int[] a, int[] b) {
		return null;
	}
}
