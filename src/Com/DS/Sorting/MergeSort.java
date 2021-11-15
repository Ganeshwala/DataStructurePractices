package Com.DS.Sorting;

public class MergeSort {

	/*
	 * This is merge process 
	 * after divide element we apply merging process to merge element and get sorted array
	 * Time Complexity T(n) = O(logn)
	 */
	public void merge(int[] A,int left,int middle,int right) {
		int[] leftTempArray = new int[middle-left+2];
		int[] rightTempArray = new int[right-middle+1];
		
		for(int i=0;i<=middle-left;i++) {
			leftTempArray[i] = A[left+i];
		}
		
		for(int j=0;j<right-middle;j++) {
			rightTempArray[j] = A[middle+1+j];
		}
		leftTempArray[middle-left+1] = Integer.MAX_VALUE;
	    rightTempArray[right-middle] = Integer.MAX_VALUE;
		int i=0,j=0;
		for(int k=left;k<=right;k++) {
			if(leftTempArray[i]<rightTempArray[j]) {
				A[k] = leftTempArray[i];
				i++;
			}else {
				A[k] = rightTempArray[j];
				j++;
			}
		}
	}
	
	public void mergeSort(int[] Array,int l,int r) {
		if(r>l) {
			int m = (r+l)/2;
			mergeSort(Array,l,m);
			mergeSort(Array,m+1,r);
			merge(Array,l,m,r);
		}
	}
	
	public void display(int arr[]) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	
}
