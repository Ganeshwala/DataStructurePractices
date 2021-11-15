package Com.DS.Sorting;

public class InputValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = {5,8,4,1,100,25,50,9,4,6,6};
		/*BubbleSortAlgo bsa = new BubbleSortAlgo();
		bsa.display(a);
		System.out.println("After Bubble Sort");
		bsa.bubbleSort(a);
		bsa.display(a);*/
		
		/*SelectionSort ss = new SelectionSort();
		ss.display(a);
		System.out.println("After Selection Sort");
		ss.selectionSortAlgo(a);
		ss.display(a);*/
		
		InsertionSort is = new InsertionSort();
		is.display(a);
		System.out.println("After Selection Sort");
		is.insertionSortAlgo(a);
		is.display(a);
		
		MergeSort m = new MergeSort();
		m.display(a);
		System.out.println("After Merge Sort");
		m.mergeSort(a, 0, a.length-1);
		m.display(a);
	}

}
