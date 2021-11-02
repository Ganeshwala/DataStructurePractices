package Com.DS.Tree.AVL;

import java.util.LinkedList;
import java.util.Queue;

public class AVLNode {

	public AVLNode left ,right,root;
	public int heigth,nodeValue;
	
	public AVLNode() {
		root = null;
	}
	
	public int getHieght(AVLNode node) {
		if(node == null) {
			return 0;
		}
		else
			return node.heigth;
	}
	
	public void levelTraversal() {
		Queue<AVLNode> queue = new LinkedList<AVLNode>();
		if(root == null) {
			System.out.println("Tree is empty");
		}else {
			queue.add(root);
			while(!queue.isEmpty()) {
				AVLNode currentNode = queue.remove();
				if(currentNode.left !=null) {
					queue.add(currentNode.left);
				}
				if(currentNode.right != null) {
					queue.add(currentNode.right);
				}
				System.out.print(currentNode.nodeValue+" ");
			}
		}
	}
	 
	// rotate Right
	private AVLNode rotateRight(AVLNode disbalanceNode) {
		AVLNode newRoot = disbalanceNode.left;
		disbalanceNode.left = disbalanceNode.left.right;
		newRoot.right = disbalanceNode;
		disbalanceNode.heigth = 1 + Math.max(getHieght(disbalanceNode.left), getHieght(disbalanceNode.right));
		newRoot.heigth = 1 + Math.max(getHieght(newRoot.left), getHieght(newRoot.right));
		return newRoot;
	}
	
	//Rotate left
	private AVLNode rotateLeft(AVLNode disbalanceNode) {
		AVLNode newRoot = disbalanceNode.right;
		disbalanceNode.right = disbalanceNode.right.left;
		newRoot.left = disbalanceNode;
		disbalanceNode.heigth = 1 + Math.max(getHieght(disbalanceNode.left), getHieght(disbalanceNode.right));
		newRoot.heigth = 1 + Math.max(getHieght(newRoot.left), getHieght(newRoot.right));
		return newRoot;
	}
	
	//getBalance
	public int getBlance(AVLNode node) {
		if(node == null) {
			return 0;
		}else {
			return getHieght(node.left) - getHieght(node.right);
		}
	}
	
	private AVLNode insertAVLNode(AVLNode currentNode,int val) {
		if(currentNode == null) {
			AVLNode newNode =  new AVLNode();
			newNode.nodeValue = val;
			newNode.heigth = 1;
			root = newNode;
			System.out.println("Create node");
			return newNode;
		}
		else if(val < currentNode.nodeValue) {
			currentNode.left = insertAVLNode(currentNode.left, val);
		}
		else{
			currentNode.right = insertAVLNode(currentNode.right, val);
		}
		currentNode.heigth = 1 + Math.max(getHieght(currentNode.left),getHieght(currentNode.right));
		int balance = getBlance(currentNode);
		
		if(balance >1 && val < currentNode.left.nodeValue) {
			return rotateRight(currentNode);
		}
		if(balance >1 && val > currentNode.left.nodeValue) {
			currentNode.left = rotateLeft(currentNode.left);
			return rotateRight(currentNode);
		}
		if(balance <-1 && val > currentNode.right.nodeValue) {
			return rotateLeft(currentNode);
		}
		if(balance < -1 && val < currentNode.right.nodeValue) {
			currentNode.right = rotateRight(currentNode.right);
			return rotateLeft(currentNode);
		}
		return currentNode;
	}
	
	public void insert(int value) {
		root = insertAVLNode(root, value); 
	}
}
