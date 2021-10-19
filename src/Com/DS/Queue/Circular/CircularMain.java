package Com.DS.Queue.Circular;

public class CircularMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CircularQueueArray cqa = new CircularQueueArray(5);
		System.out.println("Empty ? "+cqa.isEmpty());
		System.out.println("is Full ?"+cqa.isFull());
		// insert value into circular Queue 
		cqa.enQueue(5);
		cqa.enQueue(2);
		cqa.enQueue(3);
		cqa.enQueue(8);
		cqa.enQueue(10);
		cqa.enQueue(9);
		// deQueue method
		System.out.println("element remove :"+cqa.deQueue());
		System.out.println("element remove :"+cqa.deQueue());
		
		// calling peek method
		System.out.println("Top of Element is:"+cqa.peek());
		
		System.out.println("element remove :"+cqa.deQueue());
		System.out.println("element remove :"+cqa.deQueue());
		
		System.out.println("Top of Element is:"+cqa.peek());
		
		System.out.println("element remove :"+cqa.deQueue());
		System.out.println("element remove :"+cqa.deQueue());
		System.out.println("element remove :"+cqa.deQueue());
		System.out.println("element remove :"+cqa.deQueue());
	}

}
