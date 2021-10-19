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
	
	public void enQueue(int value){
		if(isFull()) {
			System.out.println("Circular Queue is Full");
			return ;
		}
		else {
			if(topOfQueue == -1) { // checking for empty queue
				topOfQueue = beginningOfQueue = 0;
				arr[topOfQueue] = value;
				System.out.println("value inserted"+value);
			}else {
				if(topOfQueue == size-1) {
					topOfQueue = 0;
				}else {
					topOfQueue++;
				}
				System.out.println("value"+value+" inserted at position"+topOfQueue);
				arr[topOfQueue] = value;
			}
		}
	}
	
	public int deQueue() {
		if(isEmpty()) {
			System.out.println("Circular Queue is Empty");
			return -1;
		}else {
			if(arr[beginningOfQueue] == 0) {
				return -1;
			}else {
				int deQueueResult = arr[beginningOfQueue];
				arr[beginningOfQueue] = 0;
				if(beginningOfQueue == size-1) {
					beginningOfQueue = 0;
				}else {
					beginningOfQueue++;
				}
				return deQueueResult;
			}
		}
	}
	
	public int peek() {
		if(isEmpty()) {
			System.out.println("Circular Queue is Empty");
			return -1;
		}else {
			int peekResult = arr[beginningOfQueue];
			return peekResult;
		}
	}
	
	public void delete() {
		System.out.println("Circular Queue is deleted !!");
		arr = null;
		beginningOfQueue = topOfQueue = -1;
		
	}
	
}
