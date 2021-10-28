package Com.DS.Tree.BinaryTree.Array;

public class BinaryTree {

	String[] arr;
	int lastIndex;
	
	public BinaryTree(int size) {
		arr = new String[size];
		this.lastIndex = -1;
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
}
