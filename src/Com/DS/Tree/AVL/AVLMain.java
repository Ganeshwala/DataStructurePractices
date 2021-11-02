package Com.DS.Tree.AVL;

public class AVLMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AVLNode node = new AVLNode();
		node.insert(5);
		node.insert(6);
		node.insert(7);
		node.insert(8);
		node.insert(9);
		node.insert(10);
		node.levelTraversal();
	}

}
