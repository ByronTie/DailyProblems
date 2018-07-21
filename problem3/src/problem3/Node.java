package problem3;

public class Node {
	public String val;
	public Node left;
	public Node right;
	
	public Node() {
		this.val = null;
		this.left = null;
		this.right = null;
	}
	
	public Node(String val) {
		this.val = val;
		this.left = null;
		this.right = null;
	}
	
	public Node(String val, Node left) {
		this.val = val;
		this.left = left;
		this.right = null;
	}
	
	public Node(String val, Node left, Node right) {
		this.val = val;
		this.left = left;
		this.right = right;
	}
}
