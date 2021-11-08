package Com.DS.Sorting;

public class InsertionSort {

	/*
	 * Insertion sort is best sorting algo.
	 * Time complexity is O(n) <= T(n) <= O(n**2)
	 * Space complexity is S(n) = O(1)
	 * 
	 * it is stable and sort in-place Algo.
	 */
	public void insertionSortAlgo(int arr[]) {
		for(int i=1;i<arr.length;i++) {
			int temp = arr[i];
			int j = i;
			while(j>0 && arr[j-1]>temp) {
				arr[j] = arr[j-1];
				j--;
			}
			arr[j] = temp;
		}
	}
	
	public void display(int arr[]) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
}
