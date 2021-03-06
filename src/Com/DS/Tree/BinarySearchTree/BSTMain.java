package Com.DS.Tree.BinarySearchTree;

public class BSTMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode node = new TreeNode();
		node.InsertNode(5);
		node.InsertNode(8);
		node.InsertNode(3);
		node.InsertNode(6);
		node.InsertNode(7);
		node.InsertNode(4);
		node.InsertNode(10);
		node.InsertNode(2);
		node.InsertNode(9);
		node.InsertNode(0);
		node.InsertNode(1);
		System.out.println("Search calling");
		node.searchNode(1);
		node.InsertNode(5);
		node.LevelOrder();
		System.out.println("========");
		node.preOrderTraversal(node.root);
		System.out.println("========");
		node.inOrderTraversal(node.root);
		System.out.println("========");
		node.postOrderTraversal(node.root);
		System.out.println("Delete calling");
		node.DeleteNode(node.root,8);
		node.inOrderTraversal(node.root);
	}

}
