package Com.DS.Queue.Circular;

public class CircularMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CircularQueueArray cqa = new CircularQueueArray(5);
		System.out.println("Empty ? "+cqa.isEmpty());
		System.out.println("is Full ?"+cqa.isFull());
	}

}
