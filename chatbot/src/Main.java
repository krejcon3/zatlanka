import java.util.Scanner;

/**
 * Created by ondrejkrejcir on 06/03/17.
 */
public class Main {

	public static void main(String[] args) {
		Node init = initialize();
		Scanner scanner = new Scanner(System.in);
		String str;
		Node node;
		while (true) {
			node = init; // reset every row to star node
			str = scanner.nextLine(); // scan row
			if (str == null || str.length() == 0) { // if empty line continue to next row
				continue;
			}

			String[] words = str.split(" ");
			for (String word : words) { // split line to words and check every word
				if (word == null || word.length() == 0) { // if empty word continue to next word
					continue;
				}
				if (node.getNode(word) == null) {
					if (node.getAnswer(word) == null) {
						System.out.println("Hey! I don't understand you, try i later.. after coffee break?");
					} else {
						System.out.println(node.getAnswer(word));
					}
					break; // after answer stop line checking
				} else {
					node = node.getNode(word);
				}
			}
		}
	}

	private static Node initialize() {
		// How old are you?
		// How are you?
		Node node = new Node();
		Node how = new Node();
		node.addNode("how", how);

		Node howOld = new Node();
		how.addNode("old", howOld);

		Node howOldAre = new Node();
		howOldAre.addAnswer("you", "About fifteen minutes i think.. and you?");
		howOldAre.addAnswer("you.", "About fifteen minutes i think.. and you?");
		howOldAre.addAnswer("you?", "About fifteen minutes i think.. and you?");
		howOldAre.addAnswer("you!", "About fifteen minutes i think.. and you?");
		howOld.addNode("are", howOldAre);

		Node howAre = new Node();
		howAre.addAnswer("you", "I am fine.. and you?");
		howAre.addAnswer("you.", "I am fine.. and you?");
		howAre.addAnswer("you?", "I am fine.. and you?");
		howAre.addAnswer("you!", "I am fine.. and you?");
		how.addNode("are", howAre);
		return node;
	}
}
