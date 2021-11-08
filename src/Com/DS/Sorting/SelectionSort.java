package Com.DS.Sorting;

public class SelectionSort {
/*
 *  Selection Sort is sorting algo. 
 *  it is stable and sort-in place algo.
 *  Time Complexity is T(n) = O(n**2)
 *  Space Complexity is S(n) = O(1)
 *  
 *   Q) when to use ?
 *   -> when we have insufficient memory
 */
	public void selectionSortAlgo(int arr[]) {
		for(int i=0;i<arr.length;i++) {
			int minIndex = i;
			// this for loop find the smallest number from remaining arr value and change it with minIndex if it found.
			for(int j=i+1;j<arr.length;j++) {
				if(arr[j] < arr[minIndex]) {
					minIndex = j;
				}
			}
			// if that value is not same as i then it's swap the value with is , this value it is stable algo.
			if(minIndex != i) {
				int temp = arr[minIndex];
				arr[minIndex] = arr[i];
				arr[i] = temp;
			}
		}
	}
	
	public void display(int arr[]) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
}
