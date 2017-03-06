import java.util.HashMap;

public class Node {

	private HashMap<String, Node> nodes;
	private HashMap<String, String> answers;

	public Node() {
		this.nodes = new HashMap<>();
		this.answers = new HashMap<>();
	}

	public void addNode(String key, Node node) {
		this.nodes.put(key.toLowerCase(), node);
	}

	public Node getNode(String key) {
		if (this.nodes.containsKey(key.toLowerCase())) {
			return this.nodes.get(key.toLowerCase());
		}
		return null;
	}

	public void addAnswer(String key, String answer) {
		this.answers.put(key.toLowerCase(), answer);
	}

	public String getAnswer(String key) {
		if (this.answers.containsKey(key.toLowerCase())) {
			return this.answers.get(key.toLowerCase());
		}
		return null;
	}
}
