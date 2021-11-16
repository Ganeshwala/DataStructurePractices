package Com.DS.BinartyTreePractices;

public class BinaryHeapTree {

	/*
	 * Implementing Binary Heap tree using Array Structure because through array structure it is easy to perform operation
	 * like insert, delete and find min or max element from tree and this can be done in 
	 * T(n) = O(logN) and S(n) = O(logN).  
	 */
	
	int[] arr;
	int sizeOfHeap;
	
	//Create/ Initialized BinaryHeap
	public BinaryHeapTree(int size) {
		arr = new int[size+1]; // size+1 because we insert element from index 1 for easy to understand.
		sizeOfHeap = 0;
		System.out.println("Binary Heap is Created");
	}
	
	/*
	 * Implementing Insert method 
	 * There are two type of Heap Tree
	 * 1) Min Heap: - each root element smaller than it's child elements
	 * 2) Max Heap: - each root element bigger than it's child elements
	 * whenever we insert element into heap tree then check that we cannot violate heap tree properties.
	 * apply heapify mehtod after inserting or deleting element from Heap Tree. 
	 */
	public void heapifyBottomToTop(int index,String heapType) {
		int parentIndex = index/2;
		if(parentIndex <1) {
			return ;
		}
		else {
			if(heapType.equalsIgnoreCase("min")) {
				if(arr[index] < arr[parentIndex]) {
					int temp = arr[index];
					arr[index] = arr[parentIndex];
					arr[parentIndex] = temp;
				}
			}else if(heapType.equalsIgnoreCase("max")){
				if(arr[index] > arr[parentIndex]) {
					int temp = arr[index];
					arr[index] = arr[parentIndex];
					arr[parentIndex] = temp;
				}
			}
		}
		heapifyBottomToTop(parentIndex,heapType);
	}
	
	public void insertNode(int value,String type) {
		arr[sizeOfHeap+1] = value;
		sizeOfHeap++;
		heapifyBottomToTop(sizeOfHeap, type);
	}
	
	// heapify for Extract Element from Heap Tree.
	public void heapifyTopToBottom(int index,String heapType) {
		int left = index*2;
		int right = index*2+1;
		int swapelement = 0;
		if(sizeOfHeap < left) {
			return ;
		}else {
			if(heapType.equalsIgnoreCase("min")) {
				if(sizeOfHeap == left) {
					if(arr[left] < arr[index]) {
						int temp = arr[left];
						arr[left] = arr[index];
						arr[index] = temp;
					}
					return ;
				}else {
					if(arr[left] > arr[right]) {
						swapelement = right;
					}else {
						swapelement = left;
					}
					if(arr[index] > arr[swapelement]) {
						int temp = arr[index];
						arr[index] = arr[swapelement];
						arr[swapelement] = temp;
					}
				}
			}
			else if(heapType.equalsIgnoreCase("max")) {
				if(sizeOfHeap == left) {
					if(arr[left] > arr[index]) {
						int temp = arr[index];
						arr[index] = arr[left];
						arr[left] = temp;
					}
					return ;
				}
				else {
					System.out.println("left"+arr[left]+" right"+arr[right]);
					if(arr[left] > arr[right]) {
						swapelement = left;
					}else {
						swapelement = right;
					}
					if(arr[index] < arr[swapelement]) {
						int temp = arr[index];
						arr[index] = arr[swapelement];
						arr[swapelement] = temp;
					}
				}
			}
		}
		heapifyTopToBottom(swapelement, heapType);
	}
	
	public int extractNode(String type) {
		int value = arr[1];
		arr[1] = arr[sizeOfHeap];
		sizeOfHeap--;
		heapifyTopToBottom(1, type);
		return value;
	}
	
	// display Heap => level order traversal
	public void displayHeapNode() {
		for(int i=1;i<=sizeOfHeap;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
}
