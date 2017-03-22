import java.util.Scanner;

public class Node {

	protected String question;

	public Node(String question) {
		this.question = question;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public void run() {
		System.out.println(this.question);
		Scanner scanner = new Scanner(System.in);
		if (scanner.nextInt() == 1) {
			System.out.println("Ano uhodl jsi");
		} else {
			System.out.println("Ne jsi vedle");
		}

	}
}
