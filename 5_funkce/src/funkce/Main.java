package funkce;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		int points = 0;

		String[] name = new String[] {"Faktorial", "Fibonacci", "Morse"};

		ArrayList<Object[]> inputs = new ArrayList<Object[]>();
		inputs.add(new Integer[] {0, 1, -10, 2, 5, 10});
		inputs.add(new Integer[] {0, 1, -10, 2, 5, 10});
		inputs.add(new String[] {
				".----,..---,...--,....-,.....,-....,--...,---..,----.",
				"1,2,3,4,5,6,7,8,9",
				".-,-...,-.-.,-..,.,..-.,--.,....,..,.---,-.-,.-..,--,-.,---,.--.,--.-,.-.,...,-,..-,...-,.--,-..-,-.--,--..",
				"a,b,c,d,e,f,g,h,i,j,k,l,m,n,o,p,q,r,s,t,u,v,w,x,y,z",
				".-,....,---,.---",
				"a,h,o,j",
				"-------",
				"aaaa",
				"+",
				"a, aa",
				" , -,.-",
				" ,a, a"
		});

		ArrayList<Object[]> outputs = new ArrayList<Object[]>();
		outputs.add(new Integer[] {1, 1, 0, 2, 120, 3628800});
		outputs.add(new Integer[] {1, 1, 0, 2, 8, 89});
		outputs.add(new String[] {
				"1,2,3,4,5,6,7,8,9",
				".----,..---,...--,....-,.....,-....,--...,---..,----.",
				"a,b,c,d,e,f,g,h,i,j,k,l,m,n,o,p,q,r,s,t,u,v,w,x,y,z",
				".-,-...,-.-.,-..,.,..-.,--.,....,..,.---,-.-,.-..,--,-.,---,.--.,--.-,.-.,...,-,..-,...-,.--,-..-,-.--,--..",
				"a,h,o,j",
				".-,....,---,.---",
				" ",
				" ",
				" ",
				".-, ",
				" , ,a",
				" ,.-, "
		});

		boolean result = false;
		int passed;
		for (int i = 0; i < inputs.size(); i++) {
			passed = 0;
			for (int j = 0; j < inputs.get(i).length; j++) {
				switch(i) {
					case 0:
						result = Test.faktorial((Integer) inputs.get(i)[j]) == (Integer) outputs.get(i)[j];
						break;
					case 1:
						result = Test.fibonacci((Integer) inputs.get(i)[j]) == (Integer) outputs.get(i)[j];
						break;
					case 2:
						result = Test.morseAlphabet((String)inputs.get(i)[j], j % 2 == 0).equals(outputs.get(i)[j]);
						break;
				}
				if (result) {
					System.out.println("OK: " + name[i] + " for value " + inputs.get(i)[j]);
					passed ++;
				} else {
					System.out.println("ER: " + name[i] + " for value " + inputs.get(i)[j]);
				}
			}
			System.out.println();
			System.out.printf("Úloha %s splněna z %d/%d\r\n", name[i], passed, inputs.get(i).length);
			int t = inputs.get(i).length == passed ? i == 2 ? 2 : 1 : 0;
			System.out.printf("Zisk bodů: %d", t);
			points += t;
			System.out.println();
			System.out.println();
		}
		System.out.println("===========================");
		System.out.printf("== Celkem získáno %d bodů ==\n", points);
		System.out.println("===========================");
	}
}
