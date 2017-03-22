public class Main {

	public static void main(String[] args) {
		new QuestNode(
				"Jsi chlupaté?",
				new QuestNode(
						"Jsi elektrické?",
						new Node("Jsi pikachu?"),
						new Node("Jsi rattata?")
				),
				new QuestNode(
						"Jsi vodní?",
						new Node("Jsi squirtle?"),
						new Node("Jsi bulbasaur?")
				)
		).run();
	}
}