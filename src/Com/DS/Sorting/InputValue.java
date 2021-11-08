package Com.DS.Sorting;

public class InputValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = {5,8,6,4,1};
		BubbleSortAlgo bsa = new BubbleSortAlgo();
		bsa.display(a);
		System.out.println("After Bubble Sort");
		bsa.bubbleSort(a);
		bsa.display(a);
	}

}
