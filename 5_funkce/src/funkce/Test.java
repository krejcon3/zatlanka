package funkce;

public class Test {

	/*
	 * vrací faktorial čísla "a"
	 * pro záporná čísla vracejte 0
	 *
	 * hodnoceno za 1b
	 */
	public static int faktorial(int a) {
		return a < 0 ? 0 : a < 2 ? 1 : a * faktorial(a - 1);
	}

	/*
	 * vrací fibonacciho posloupnost pro číslo "a"
	 * pro záporná čísla vracejte 0
	 *
	 * hodnoceno za 1b
	 */
	public static int fibonacci(int a) {
		return a < 0 ? 0 : a < 2 ? 1 : fibonacci(a - 1) + fibonacci(a - 2);
	}

	/*
	 * pokud je fromMorse true převadí z morseovky do normální abecedy
	 * pokud je fromMorse false převdáí z normální abecedy do morseovky
	 *
	 * pro a vrací .-
	 * pro jakékoliv neočekávané vstupy (více než jedno písmeno, písmeno s diakritikou apod) vrací mezeru
	 * pro mezeru vrací mezeru
	 * převádí do a z morseovky i číslice
	 *
	 * uvažujme českou abecedu bez diakritiky
	 *
	 * hodnoceno za 2b
	 *
	 * HINT: a.split(",") -> získám String[]
	 */
	public static String morseAlphabet(String a, boolean fromMorse) {
		String[] morse = new String[] {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--..", "-----", ".----", "..---", "...--", "....-", ".....", "-....", "--...", "---..", "----."};
		String[] alphabet = new String[] {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z", "0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
		String[] inputs = a.split(",");
		String[] outputs = new String[inputs.length];

		for(int i = 0; i < inputs.length; i++) {
			outputs[i] = fromMorse ? translateFromTo(inputs[i], morse, alphabet, fromMorse) : translateFromTo(inputs[i], alphabet, morse, fromMorse);
		}

		String result = "";
		for (int i = 0; i < outputs.length - 1; i++) {
			result += outputs[i] + ",";
		}

		return result + outputs[outputs.length - 1];
	}

	private static String translateFromTo(String string, String[] from, String[] to, boolean fromMorse) {
		if (string.equals(" ") || string.length() != 1 && !fromMorse) {
			return " ";
		}

		for (int i = 0; i < from.length; i++) {
			if (string.equals(from[i])) {
				return to[i];
			}
		}

		return " ";
	}
}
