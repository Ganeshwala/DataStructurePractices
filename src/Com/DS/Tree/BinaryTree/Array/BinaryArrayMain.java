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
		bt.preOrderTraversal(1);
		System.out.println();
		bt.inOrderTraversal(1);
		System.out.println();
		bt.postOrderTraversal(1);
		System.out.println();
		bt.levelOrderTraversal(1);
	}

}
