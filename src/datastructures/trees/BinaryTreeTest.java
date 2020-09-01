package trees;

import org.junit.Test;

public class BinaryTreeTest {
	
	@Test
	public void test() {
		BinaryTree tree = new BinaryTree();

		tree.insert(50);
		tree.insert(25);
		tree.insert(75);
		tree.insert(10);
		tree.insert(30);
		tree.insert(60);
		tree.insert(80);
		tree.insert(85);
		tree.insert(1);
		tree.insert(100);
		
		tree.traverse();
	}

}
