package Com.DS.Tree.BinaryHeap;

public class HeapMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryHeap heap = new BinaryHeap(5);
		heap.insertValue(10, "Max");
		heap.insertValue(5, "Max");
		heap.insertValue(15, "Max");
		heap.insertValue(8, "Max");
		heap.insertValue(1, "Max");
		//System.out.println(heap.peek());
		heap.levelTraversal();
		System.out.println("======");
		System.out.println(heap.extractHeadOfHeap("Min"));
		System.out.println("======");
		heap.levelTraversal();
	}

}
