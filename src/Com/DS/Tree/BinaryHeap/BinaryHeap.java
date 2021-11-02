package Com.DS.Tree.BinaryHeap;

public class BinaryHeap {

	int[] arr;
	int treeSize;
	
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
	
	public void heapifyBottomToTop(int index, String heapType) {
		int parent = index / 2 ;
		if(index <= 1) {
			return ;
		}else {
			if(heapType == "Min") {
				if(arr[index] < arr[parent]) {
					int tempValue = arr[index];
					arr[index] = arr[parent];
					arr[parent] = tempValue;
				}
			}else if (heapType == "Max") {
				if(arr[index] > arr [parent]) {
					int tempValue = arr[index];
					arr[index] = arr[parent];
					arr[parent] = tempValue;
				}
			}
		}
		heapifyBottomToTop(parent, heapType);
	}
	
	public void insertValue(int value,String type) {
		arr[treeSize+1] = value;
		treeSize++;
		heapifyBottomToTop(treeSize, type);
		System.out.println("Value "+value+" inserted successfully");
	}
}
