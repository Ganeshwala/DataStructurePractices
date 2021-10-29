package Com.DS.Tree.BinaryTree.Array;

public class BinaryArrayMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTree bt = new BinaryTree(5);
		bt.InsertNode("N1");
		bt.InsertNode("N3");
		bt.InsertNode("N4");
		bt.InsertNode("N5");
		bt.InsertNode("N2");
		System.out.println("Pre Order of Binary Tree");
		bt.preOrderTraversal(1);
		System.out.println();
		System.out.println("In Order of Binary Tree");
		bt.inOrderTraversal(1);
		System.out.println();
		System.out.println("Post Order of Binary Tree");
		bt.postOrderTraversal(1);
		System.out.println();
		System.out.println("level Order of Binary Tree");
		bt.levelOrderTraversal(1);
	}

}
