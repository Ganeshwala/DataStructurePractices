package Com.DS.Queue.Circular;

public class CircularQueueArray {

	int[] arr;
	int topOfQueue;
	int beginningOfQueue;
	int size;
	
	public CircularQueueArray(int size) {
		// TODO Auto-generated constructor stub
		arr = new int[size];
		topOfQueue = -1;
		beginningOfQueue = -1;
		this.size = size;
	}
	
	public boolean isEmpty() {
		if(beginningOfQueue == -1 ||topOfQueue == -1) {
			return true;
		}else {
			return false;
		}
	}
	
	public boolean isFull() {
		if(topOfQueue+1 == beginningOfQueue ||(beginningOfQueue == 0 && topOfQueue == size-1)) {
			return true;
		}else {
			return false;
		}
	}
	
}
