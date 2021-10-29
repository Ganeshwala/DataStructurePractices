package Com.DS.Tree.BinaryTree.Array;

public class BinaryTree {

	String[] arr;
	int lastIndex;
	
	public BinaryTree(int size) {
		arr = new String[size+1];
		this.lastIndex = 0;
		System.out.println("Blank Tree of size "+size+" is Created !!!!");
	}
	
	public boolean isFull() {
		if(arr.length-1 == lastIndex) {
			return true;
		}else {
			return false;
		}
	}
	
	public void InsertNode(String value){
		if(!isFull()) {
			arr[lastIndex+1] = value;
			lastIndex++;
			System.out.println("Value "+value+" has been Inserted !!");
		}else {
			System.out.println("Binary tree is Full");
		}
	}
	
	public void preOrderTraversal(int index) {
		if(index > lastIndex) {
			return;
		}
		System.out.print(arr[index]+" ");
		preOrderTraversal(index*2);
		preOrderTraversal(index*2 +1);
		//System.out.println();
	}
	
	public void inOrderTraversal(int index) {
		if(index > lastIndex) {
			return ;
		}
		inOrderTraversal(index*2);
		System.out.print(arr[index]+" ");
		inOrderTraversal(2*index + 1);
	}
	
	public void postOrderTraversal(int index) {
		if(index > lastIndex) {
			return ;
		}
		postOrderTraversal(index*2);
		postOrderTraversal(2*index+1);
		System.out.print(arr[index]+" ");
	}
	
	public void levelOrderTraversal(int index) {
		/*for(String s : arr) {
			System.out.print(s);
		}*/
		for(int i=0;i<arr.length;i++) {
			if(index > lastIndex)
				return ;
			System.out.print(arr[index]+" ");
			index++;
		}
		System.out.println();
	}
}
