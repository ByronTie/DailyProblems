package problem3;

public class NodeStreamer2 {
	
	private class DeserializeResult {
		public Node node = null;
		public int nextIndex = 0;
	}
	
	public String serialize(Node node) {
		return serializeNode("", node);
	}
	
	private String serializeNode(String result, Node node) {
		if(node == null) {
			return "-1";
		}
		
		String nodeLeft = serializeNode(result, node.left);
		String nodeRight = serializeNode(result, node.right);
		result += String.format("%s %s %s", node.val, nodeLeft, nodeRight);
		
		return result;
	}
	
	public Node deserialize(String input) {
		if (input == null || input.isEmpty()) {
			return new Node();
		}
		
		String[] values = input.split(" ");
		int rootIndex = 0;
		
		return deserializeNode(values, rootIndex).node;
	}
	
	private DeserializeResult deserializeNode(String[] values, int currentIndex) {
		
		DeserializeResult result = new DeserializeResult();
		Node currentNode;
		System.out.println("current value: " + values[currentIndex] + ", index: " + currentIndex);
		
		int nextIndex = currentIndex + 1;
		
		if (values[currentIndex].equals("-1")) {
			currentNode = null;
			
		} else {
			currentNode = new Node();
			currentNode.val = values[currentIndex];
			
			DeserializeResult leftResult = deserializeNode(values, nextIndex);
			currentNode.left = leftResult.node;
			nextIndex = leftResult.nextIndex;
			
			DeserializeResult rightResult = deserializeNode(values, nextIndex);
			currentNode.right = rightResult.node;
			nextIndex = rightResult.nextIndex;
		}
		
		result.node = currentNode;
		result.nextIndex = nextIndex; 
	
		return result;
	}
}
