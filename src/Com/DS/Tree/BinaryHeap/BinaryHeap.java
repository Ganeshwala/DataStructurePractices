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
	
	/*
		implementing heapify method for insert element in Heap Tree 
		this method work like first insert value at bottom of array and then we compare with each sub-tree and satisfied Heap condition. 
	*/
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
	/*
		implementing heapify method for extract root element in Heap Tree 
		this method work like it compare root value with it children and swap it as per heap condition. so value move from top to bottom.
	*/
	public void heapifyTopToBottom(int index, String heapType) {
		int left = 2*index;
		int right = 2*index+1;
		int swapChild = 0;
		if(treeSize < left) {
			return ;
		}else {
			if(heapType == "Max") {
				if(treeSize == left) {
					if(arr[index] < arr[left]) {
						int temp = arr[index];
						arr[index] = arr[left];
						arr[left] = temp;
					}
					return ;
				}
				else {
					if(arr[left] > arr[right]) {
						swapChild = left;
					}
					else {
						swapChild = right;
					}
					if(arr[index] < arr[swapChild]) {
						int temp = arr[index];
						arr[index] = arr[swapChild];
						arr[swapChild] = temp;
					}
				}
			}
			if(heapType == "Min") {
				if(treeSize == left) {
					if(arr[index] > arr[left]) {
						int temp = arr[index];
						arr[index] = arr[left];
						arr[left] = temp;
					}
					return ;
				}
				else {
					if(arr[left] < arr[right]) {
						swapChild = left;
					}
					else {
						swapChild = right;
					}
					if(arr[index] > arr[swapChild]) {
						int temp = arr[index];
						arr[index] = arr[swapChild];
						arr[swapChild] = temp;
					}
				}
			}
		}
		heapifyTopToBottom(swapChild, heapType);
	}
	
	
	public int extractHeadOfHeap(String heapType) {
		if(isEmpty()) {
			return -1;
		}else {
			int extractValue = arr[1];
			arr[1] = arr[treeSize];
			treeSize--;
			heapifyTopToBottom(1,heapType);
			return extractValue;
		}
	}
}
