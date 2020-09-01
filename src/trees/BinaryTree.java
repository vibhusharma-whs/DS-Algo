package trees;

//create a node
class Node{
	int data;
	Node left;
	Node right;
	
	public Node() {}
	
	public Node(int val) {
		this.data = val;
		this.left = null;
		this.right = null;
	}
}
//create tree
public class BinaryTree {
	
	Node root;
	
	public void insert(int val) {
		
		Node toAdd = new Node(val);
		
		if(root == null) {
			root = toAdd;
		}
		
		traverseAndAddNode (root, toAdd);
	}

	private void traverseAndAddNode(Node node, Node toAdd) {
		
		if(node.data < toAdd.data) {
			if(node.right == null) node.right = toAdd;
			else traverseAndAddNode(node.right, toAdd);
		}
		
		else if(node.data > toAdd.data) {
			if(node.left == null) node.left = toAdd;
			else traverseAndAddNode(node.left, toAdd);
		}
		
	}

	public void traverse() {
		
		if(root != null) {
			
			Node nodeToTraverse = root;
			
			if(nodeToTraverse.left == null && nodeToTraverse.right == null) {
				System.out.println(nodeToTraverse.data);
			}
			
			else {
				if(nodeToTraverse.left != null) {
					inOrderTraversal(nodeToTraverse.left);
				}
				if(nodeToTraverse.right != null) {
					inOrderTraversal(nodeToTraverse.right);
				}
			}
			
		}
	}
	
	private void inOrderTraversal(Node node) {
		
		if(node.left !=null) {
			inOrderTraversal(node.left);
		}
		
		System.out.println(node.data);
		
		if(node.right != null) {
			inOrderTraversal(node.right);
		}
		
		
	}
}


