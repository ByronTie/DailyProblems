package problem3;

//(,,)
//(root,,)
//(root,(left,,),)
//(root,,(right,,))
//(root,(left,,),(right,,))
//(root,(left,(left.left,,),),(right,,))
//(root,(left,(left.left,,),),(right,,(right.right,,))

/*
 * First pass prototype
 * 
 * 1. Get value
 * 
 * 2. Get left string
 *  - count start brackets to until first closing bracket. This  indicates how many closed 'sets'
 *    there are.
 *  - recursive call to get value of left node
 * 
 * 3. Get right string
 *  - remainder of input without last closing bracket (that belongs to the current node)
 *  - recursive call to get value of right node 
 *  
 * Possible future iterations:
 *  - improve abstraction levels in code
 *  - break out function to find enclosed sets
 *  	- via count open brackets strategy
 *  	- improve this strategy
 *  - consider more deserialize-friendly representation of serialized data
 */
public class NodeStreamer {

	public String serialize(Node node) {
		return serializeNode("", node);
	}
	
	private String serializeNode(String result, Node node) {
		if(node == null) {
			return "";
		}
		
		String nodeLeft = serializeNode(result, node.left);
		String nodeRight = serializeNode(result, node.right);
		result += String.format("(%s,%s,%s)", node.val, nodeLeft, nodeRight);
		
		return result;
	}
	
	public Node deserialize(String input) {
		return deserializeNode(input);
	}
	
	private Node deserializeNode(String input) {
		System.out.println("Node: " + input);
		if (input == null) {
			return null;
		}
		
		Node node = new Node();
		
		String value = input.substring(1, input.indexOf(","));
		node.val = value;

		String left = "";
		String right = "";
		int indexLeftStart = input.indexOf(",") + 1;
		int indexLeftEnd = input.indexOf(")");
		
		char leftFirstChar = input.charAt(indexLeftStart);
		if (leftFirstChar == '(') {
			int countStartBrackets = 0;
			for(int i = indexLeftStart; i < indexLeftEnd; i++) {
				if (input.charAt(i) == '(') {
					countStartBrackets++;
				}
			}
			
			if(countStartBrackets == 0) {
				left = input.substring(indexLeftStart, indexLeftEnd + 1);
			} else {
				for(int i = indexLeftEnd; i < input.length(); i++) {
					if (input.charAt(i) == ')') {
						countStartBrackets--;
						
						if(countStartBrackets == 0) {
							left = input.substring(indexLeftStart, i + 1);
							indexLeftEnd = i + 1;
						}
					}
				}
			}
			
//			System.out.println("left: " + left);
			node.left = deserializeNode(left);
			
			//(value,(), ... )
			indexLeftEnd += 1;
		} else {
			//(value, ... )
			indexLeftEnd = indexLeftStart + 1;
		}
		
		right = input.substring(indexLeftEnd, input.length() - 1);
		
		if(right.length() > 0 && right.charAt(0) == '(') {
//			System.out.println("right: " + right);
			node.right = deserializeNode(right);
		}
		
		return node;
	}
}
