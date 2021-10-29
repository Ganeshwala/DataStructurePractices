package Com.DS.Tree.BinarySearchTree;

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
	
}
