package Com.DS.Queue.Linear;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		QueueArray queue = new QueueArray(4);
		queue.isEmpty();
		queue.isFull();
		queue.enQueue(5);
		queue.enQueue(10);
		queue.enQueue(1);
		queue.enQueue(3);
		System.out.println("first peek element of Queue"+queue.peek());
		System.out.println("first element of"+queue.deQueue());
		System.out.println("Second element of Queue"+queue.deQueue());
		System.out.println("peek element after delete element is"+queue.peek());
	}

}
