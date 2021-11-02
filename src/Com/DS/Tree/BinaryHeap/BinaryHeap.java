package Com.DS.Tree.BinaryHeap;
/*
	Heap Implementation using Array
*/
public class BinaryHeap {

	int[] arr;
	int treeSize; // size of array
	
	public BinaryHeap(int size) {
		arr = new int[size+1];
		treeSize = 0;
	}
	
	public boolean isEmpty() {
		if(treeSize == 0) {
			return true;
		}
		return false;
	}
	
	public Integer peek() {
		if(isEmpty()) {
			System.out.println("Heap tree is Empty");
			return null;
		}else {
			return arr[1];
		}
	}
	
	public int sizeOfHeap() {
		return treeSize;
	}
	
	public void levelTraversal() {
		for(int i=1;i<=treeSize;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
}
