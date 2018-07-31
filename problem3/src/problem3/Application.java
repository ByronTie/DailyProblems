package problem3;

/*
 * This problem was asked by Google.
 * 
 * Given the root to a binary tree, implement serialize(root), 
 * which serializes the tree into a string, and deserialize(s), 
 * which deserializes the string back into the tree.
 * 
 * For example, given the following Node class
 * 
 * class Node:
 * 	def __init__(self, val, left=None, right=None):
 * 		self.val = val
 * 		self.left = left
 * 		self.right = right
 * 
 * The following test should pass:
 * 
 * node = Node('root', Node('left', Node('left.left')), Node('right'))
 * assert deserialize(serialize(node)).left.left.val == 'left.left'
 * 
 * @author byrontie
 *
 */
public class Application {

	public static void main(String[] args) {
		System.out.println("start");
		
		Node node = new Node("root", new Node("left", new Node("left.left")), new Node("right", null, new Node("right.right")));
//		Node node = new Node("root");
		
		try {
			NodeStreamer streamer = new NodeStreamer();
			System.out.println("Serial output: " + streamer.serialize(node));
			
			Node deserializedNode = streamer.deserialize(streamer.serialize(node));
			
			if (!deserializedNode.left.left.val.equals("left.left")) {
				throw new Exception("Not equal");
			}
			
		} catch (Exception e) {
			System.out.println(e.toString());
		}	
		
		System.out.println("-------------------------------------");
		
		try {
			NodeStreamer2 streamer2 = new NodeStreamer2();
			System.out.println("Serial output: " + streamer2.serialize(node));
			
			Node deserializedNode2 = streamer2.deserialize(streamer2.serialize(node));
			
			if (!deserializedNode2.left.left.val.equals("left.left")) {
				throw new Exception("Not equal");
			}
			
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		
		System.out.println("done.");
	}
}
