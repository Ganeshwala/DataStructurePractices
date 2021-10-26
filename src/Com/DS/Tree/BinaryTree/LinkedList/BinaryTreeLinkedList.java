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
	
	//Insertion node into Tree
	public void insert(String value) {
		BinaryTreeNode newNode = new BinaryTreeNode();
		newNode.nodeValue = value;
		if(root == null) {
			root = newNode;
			System.out.println("Value added at root of tree");
			return;
		}
		Queue<BinaryTreeNode> queue =  new LinkedList<BinaryTreeNode>();
		queue.add(root);
		while(!queue.isEmpty()) {
			BinaryTreeNode presentNode = queue.remove();
			if(presentNode.leftNode == null) {
				presentNode.leftNode = newNode;
				System.out.println("Value left added successfully");
				break ;
			}else if(presentNode.rightNode == null) {
				presentNode.rightNode = newNode;
				System.out.println("Value right added successfully");
				break ;
			}else {
				queue.add(presentNode.leftNode);
				queue.add(presentNode.rightNode);
			}
		}
	}
	
	/*
	 * delete node for that, first i find the last node(element) of tree
	 * then remove the edge of last node from tree.
	 * find the value we want to delete and replace that value with last node(element) value of tree.
	 */
	//find the last element of tree
	public BinaryTreeNode depestNode() {
		Queue<BinaryTreeNode> queue = new LinkedList<BinaryTreeNode>();
		queue.add(root);
		BinaryTreeNode presentNode = new BinaryTreeNode();
		while(!queue.isEmpty()) {
			presentNode = queue.remove();
			if(presentNode.leftNode!=null) {
				queue.add(presentNode.leftNode);
			}
			if(presentNode.rightNode != null) {
				queue.add(presentNode.rightNode);
			}
		}
		return presentNode;
	}
	
	//remove th last node edge from tree
	public void removeEdge() {
		Queue<BinaryTreeNode> queue = new LinkedList<BinaryTreeNode>();
		queue.add(root);
		BinaryTreeNode presentNode = null,previousNode;
		while(!queue.isEmpty()) {
			previousNode = presentNode;
			presentNode = queue.remove();
			if(presentNode.leftNode ==null) {
				previousNode.rightNode = null;
				return ;
			}
			else if(presentNode.rightNode == null) {
				presentNode.leftNode = null;
				return ;
			}else {
				queue.add(presentNode.leftNode);
				queue.add(presentNode.rightNode);
			}
		}
	}
	
	//delete node/ replace that node with last node
	public void deleteNode(String value) {
		Queue<BinaryTreeNode> queue = new LinkedList<BinaryTreeNode>();
		queue.add(root);
		while(!queue.isEmpty()) {
			BinaryTreeNode presentNode = queue.remove();
			if(presentNode.nodeValue == value) {
				presentNode.nodeValue = depestNode().nodeValue;
				removeEdge();
				System.out.println("Node is delete");
				return ;
			}else {
				if(presentNode.leftNode!=null) {
					queue.add(presentNode.leftNode);
				}
				if(presentNode.rightNode != null) {
					queue.add(presentNode.rightNode);
				}
			}
		}
		System.out.println("Value is not present in tree");
	}
	
	public void deleteBinaryTree() {
		root = null;
		System.out.println("Binary tree has been successfully deleted !!!");
	}
	
}
