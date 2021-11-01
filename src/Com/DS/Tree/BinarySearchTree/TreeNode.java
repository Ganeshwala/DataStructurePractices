package Com.DS.Tree.BinarySearchTree;

import java.util.LinkedList;
import java.util.Queue;

public class TreeNode {

	public int nodeValue;
	TreeNode leftNode,rightNode,root;
	
	public TreeNode() {
		root = null;
	}
	
	public void InsertValueBST(TreeNode currentNode,int value) {
		TreeNode newNode = new TreeNode();
		newNode.nodeValue = value;
		if(root == null) {
			root = newNode;
			System.out.println("Root node is added");
		}else {
			//System.out.println(currentNode.nodeValue);
			if(currentNode.nodeValue >value ) {
				if(currentNode.leftNode !=null) {
					currentNode = currentNode.leftNode;
					InsertValueBST(currentNode,value);
				}
				else {
					currentNode.leftNode = newNode;
					System.out.println("Left Node is Added");
				}
			}else if(currentNode.nodeValue < value){
				if(currentNode.rightNode != null) {
					currentNode = currentNode.rightNode;
					InsertValueBST(currentNode,value);
				}else {
					currentNode.rightNode = newNode;
					System.out.println("Right node is added");
				}
			}else {
				System.out.println("Node all ready there !!!");
			}
		}
	}
	
	public void InsertNode(int value) {
		InsertValueBST(root, value);
	}
	
	public void inOrderTraversal(TreeNode root) {
		if(root != null) {
			inOrderTraversal(root.leftNode);
			System.out.print(root.nodeValue+" ");
			inOrderTraversal(root.rightNode);
		}else {
			return ;
		}
	}
	
	public void preOrderTraversal(TreeNode root) {
		if(root != null) {
			System.out.print(root.nodeValue+" ");
			preOrderTraversal(root.leftNode);
			preOrderTraversal(root.rightNode);
		}else {
			return ;
		}
	}
	
	public void postOrderTraversal(TreeNode root) {
		if(root != null) {
			postOrderTraversal(root.leftNode);
			postOrderTraversal(root.rightNode);
			System.out.print(root.nodeValue+" ");
		}
	}
	
	public void LevelOrder() {
		Queue<TreeNode> queue =  new LinkedList<TreeNode>(); 
		if(root != null) {
			queue.add(root);
		}
		while(!queue.isEmpty()){
			TreeNode temp = queue.remove();
			System.out.print(temp.nodeValue+" ");
			if(temp.leftNode != null)
				queue.add(temp.leftNode);
			if(temp.rightNode != null)
				queue.add(temp.rightNode);
		}
	}
	
	public void searchNode(int value) {
		searchValue(root,value);
	}
	
	public boolean searchValue(TreeNode currentRoot ,int value) {
		if(currentRoot == null) {
			System.out.println("BST Tree is Empty");
			return false;
		}else {
			while(currentRoot != null ) {
				//System.out.println("Root value====>"+root.nodeValue);
				if(currentRoot.nodeValue > value) {
					currentRoot = currentRoot.leftNode;
				}else if(currentRoot.nodeValue < value) {
					currentRoot = currentRoot.rightNode;
				}else {
					System.out.println("Value found :) ");
					return true;
				}
			}
			System.out.println("Value not found !!!!");
			return false;
		}
	}
	
	

	// find minimum node from right 
	public TreeNode minimumNode(TreeNode root) {
		if(root.leftNode == null) {
			return root;
		}
		else {
			return minimumNode(root.leftNode);
		}
	}
	
	//delete function
	public TreeNode DeleteNode(TreeNode root,int val) {
		System.out.println("val=====>"+root.nodeValue);
		if(root == null) {
			System.out.println("Value not found");
			return null;
		}
		if(val < root.nodeValue) {
			root.leftNode = DeleteNode(root.leftNode, val);
		}
		else if(val > root.nodeValue) {
			root.rightNode = DeleteNode(root.rightNode, val);
		}
		else {
			if(root.leftNode != null && root.rightNode != null) {
				TreeNode temp = root;
				TreeNode minNodeForRight = minimumNode(temp.rightNode);
				root.nodeValue = minNodeForRight.nodeValue;
				root.rightNode = DeleteNode(root.rightNode, minNodeForRight.nodeValue);
			}
			else if(root.leftNode !=null) {
				root = root.leftNode;
			}else if(root.rightNode !=null) {
				root = root.rightNode;
			}else {
				root = null;
			}
		}
		return root;
	}
}
