package Com.DS.Tree.BinaryTree.LinkedList;
import java.util.*;
public class BinaryTreeLinkedList {

	BinaryTreeNode root;
	
	public BinaryTreeLinkedList() {
		this.root=null;
	}
	/*
	 * Implementing DFS-(Depth First Search) Traversal methods 
	 * 1)Pre-Order : Traversal like first root node then it's left node and then it's right node of tree
	 * 2)Post-Order : Traversal like first it's left node then right node and then it's root node of tree
	 * 3)In-Order : Traversal like first left node then it's root node and then right node of tree 
	 * for storing the traversal value we use like stack DS.
	 */
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
	
	/*
	 * Implementing BFS-(Breadth First Search) traversal method level-order
	 * this method print all the node at same level first then it move to next level of tree. 
	 * here we use Queue DS to store the value.
	 */
	public void levelOrder() {
		Queue<BinaryTreeNode> queue = new LinkedList<BinaryTreeNode>();
		queue.add(root);
		while(!queue.isEmpty()) {
			BinaryTreeNode presentNode =queue.remove();
			System.out.print(presentNode.nodeValue+" ");
			if(presentNode.leftNode!=null) {
				queue.add(presentNode.leftNode);
			}
			if(presentNode.rightNode!=null) {
				queue.add(presentNode.rightNode);
			}
		}
	}
	// search the value
	public void SearchValue(String value) {
		Queue<BinaryTreeNode> node = new LinkedList<BinaryTreeNode>();
		node.add(root);
		int count = 1;
		while(!node.isEmpty()) {
			BinaryTreeNode presentNode=node.remove();
			if(presentNode.nodeValue.equals(value)) {
				System.out.println(presentNode.nodeValue+" Value found in Tree");
				return ;
			}
			else {
				if(presentNode.leftNode!=null) {
					node.add(presentNode.leftNode);
				}
				if(presentNode.rightNode!=null) {
					node.add(presentNode.rightNode);
				}
			}
		}
		System.out.println("Value is not found in Tree");
	}
	
}
