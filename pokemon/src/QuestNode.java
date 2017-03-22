import java.util.Scanner;

public class QuestNode extends Node {

	private Node trueNode;
	private Node falseNode;

	public QuestNode(String question, Node trueNode, Node falseNode) {
		super(question);
		this.trueNode = trueNode;
		this.falseNode = falseNode;
	}

	public Node getTrueNode() {
		return trueNode;
	}

	public void setTrueNode(Node trueNode) {
		this.trueNode = trueNode;
	}

	public Node getFalseNode() {
		return falseNode;
	}

	public void setFalseNode(Node falseNode) {
		this.falseNode = falseNode;
	}

	public void run() {
		System.out.println(this.question);
		Scanner scanner = new Scanner(System.in);
		if (scanner.nextInt() == 1) {
			this.trueNode.run();
		} else {
			this.falseNode.run();
		}
	}
}
