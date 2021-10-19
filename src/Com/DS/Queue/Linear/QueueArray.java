package Com.DS.Queue.Linear;

public class QueueArray {

	int[] arr ;
	int topOfQueue;
	int beginningOfQueue;
	
	public QueueArray(int size){
		arr=new int[size];
		topOfQueue=-1;
		beginningOfQueue=-1;
	}
	
	public boolean isEmpty() {
		if(topOfQueue==-1) {
			return true;
		}
		return false;
	}
	
	public boolean isFull() {
		if(topOfQueue==arr.length-1) {
			return true;
		}
		return false;
	}
	
	public void enQueue(int value) {
		if(isFull()) {
			return ;
		}else if(isEmpty()) {
			beginningOfQueue=0;
		}
		topOfQueue++;
		arr[topOfQueue]=value;
	}
	
	public int deQueue() {
		if(isEmpty()) {
			return -1;
		}
		else {
			int removeElement = arr[beginningOfQueue];
			arr[beginningOfQueue] = 0; // for empty cell I Used 0 , 0 = means empty / null value  
			beginningOfQueue++;
			if(beginningOfQueue>topOfQueue) {
				beginningOfQueue=topOfQueue=-1;
			}
			return removeElement;
		}
	}
	
	public int peek() {
		if(isEmpty()) {
			return -1;
		}
		else {
			int firstElement = arr[beginningOfQueue];
			return firstElement;
		}
	}
	
	public void deleteQueue() {
		arr = null;
		beginningOfQueue=-1;
		topOfQueue=-1;
	}
}
