package Com.DS.LinkedList;

public class CircularSinglyLinkedListMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CircularSinglyLinkedList csll = new CircularSinglyLinkedList();
		csll.createCircularSinglyLinkedList(5);
		System.out.println(csll.head.value);
		System.out.println(csll.head.next.value);
	}

}
