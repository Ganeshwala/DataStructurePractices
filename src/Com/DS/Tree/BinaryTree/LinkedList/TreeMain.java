package Com.DS.Tree.BinaryTree.LinkedList;

public class TreeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BinaryTreeLinkedList btll = new BinaryTreeLinkedList();
		BinaryTreeNode N1 = new BinaryTreeNode();
		N1.nodeValue = "N1";
		BinaryTreeNode N2 = new BinaryTreeNode();
		N2.nodeValue = "N2";
		BinaryTreeNode N3 = new BinaryTreeNode();
		N3.nodeValue = "N3";
		BinaryTreeNode N4 = new BinaryTreeNode();
		N4.nodeValue = "N4";
		BinaryTreeNode N5 = new BinaryTreeNode();
		N5.nodeValue = "N5";
		BinaryTreeNode N6 = new BinaryTreeNode();
		N6.nodeValue = "N6";
		BinaryTreeNode N7 = new BinaryTreeNode();
		N7.nodeValue = "N7";
		BinaryTreeNode N8 = new BinaryTreeNode();
		N8.nodeValue = "N8";
		
		N1.leftNode = N2;
		N1.rightNode = N3;
		N2.leftNode = N4;
		N2.rightNode = N5;
		N3.rightNode = N6;
		N4.leftNode = N7;
		N4.rightNode = N8;
		btll.root = N1;
		
		System.out.println("Pre-Order Traversal of Binary Tree");
		btll.preOrderTraversal(btll.root);
		
		System.out.println();
		System.out.println("Post-Order Traversal of Binary Tree");
		btll.postOrderTraversal(btll.root);
		
		System.out.println();
		System.out.println("In-Order Traversal of Binary Tree");
		btll.inOrderTraversal(btll.root);
		
		System.out.println();
		System.out.println("level-Order Traversal of Binary Tree");
		btll.levelOrder();
		System.out.println();
		btll.SearchValue("N10");
	}

}
