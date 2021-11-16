package Com.DS.BinartyTreePractices;

public class HeapMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {10,50,42,88,90,100,7,30,60};
		BinaryHeapTree heap = new BinaryHeapTree(arr.length);
		for(int i=0;i<arr.length;i++) {
			heap.insertNode(arr[i], "max");
		}
		heap.displayHeapNode();
		//System.out.println(heap.extractNode("max"));
		// find second highest value from Array.
		int maxvalue =0;
		for(int j=0;j<2;j++) {
			maxvalue=heap.extractNode("max");
		}
		System.out.println("2 max value is:"+maxvalue);
		heap.displayHeapNode();
	}

}
