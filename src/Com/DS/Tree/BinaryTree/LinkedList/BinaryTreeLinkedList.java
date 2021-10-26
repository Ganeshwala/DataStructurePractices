package Com.DS.Tree.BinaryTree.LinkedList;

public class BinaryTreeLinkedList {

	BinaryTreeNode root;
	
	public BinaryTreeLinkedList() {
		this.root=null;
	}
	
	//Pre-Order Traversal
	public void preOrderTraversal(BinaryTreeNode node) {
		if(node !=null) {
			System.out.print(node.nodeValue+" ");
			preOrderTraversal(node.leftNode);
			preOrderTraversal(node.rightNode);
		}else {
			return ;
		}
	}
	
	//Post-Order Traversal
	public void postOrderTraversal(BinaryTreeNode node) {
		if(node != null) {
			postOrderTraversal(node.leftNode);
			postOrderTraversal(node.rightNode);
			System.out.print(node.nodeValue+" ");
		}else {
			return ;
		}
	}
	
	//In-Order Traversal
	public void inOrderTraversal(BinaryTreeNode node) {
		if(node != null) {
			inOrderTraversal(node.leftNode);
			System.out.print(node.nodeValue+" ");
			inOrderTraversal(node.rightNode);
		}else {
			return ;
		}
	}
}
