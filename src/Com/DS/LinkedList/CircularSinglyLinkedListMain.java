package Com.DS.LinkedList;

public class CircularSinglyLinkedListMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CircularSinglyLinkedList csll = new CircularSinglyLinkedList();
		csll.createCircularSinglyLinkedList(5);
		System.out.println(csll.head.value);
		System.out.println(csll.head.next.value);
		
		// intsertion new node value at first
		csll.insertNode(4, 0);
		System.out.println(csll.head.value);
		System.out.println(csll.head.next.value);
		//System.out.println(csll.tail.next.value);
		
		// intsertion new node value at last
		csll.insertNode(8, 3);
		System.out.println(csll.tail.value);
		System.out.println(csll.head.next.value);
		//System.out.println(csll.tail.next.value);

		// intsertion new node value at any position
		csll.insertNode(6,2);
		System.out.println(csll.tail.value);
		System.out.println(csll.head.next.value);
		System.out.println(csll.tail.next.value);
		
	}

}
