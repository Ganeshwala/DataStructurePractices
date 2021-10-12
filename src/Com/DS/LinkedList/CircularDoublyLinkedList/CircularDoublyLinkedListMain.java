package Com.DS.LinkedList.CircularDoublyLinkedList;

public class CircularDoublyLinkedListMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CircularDoublyLinkedList cdll = new CircularDoublyLinkedList();
		cdll.createCircularDoublyLinked(5);
		System.out.println(cdll.head.value);
		cdll.InsertCDLL(4, 1);
		cdll.InsertCDLL(7, 10);
		cdll.InsertCDLL(0, 0);
		cdll.InsertCDLL(10, 15);
		cdll.TraverseCDLL();
		cdll.DeleteCDLL(6);
		cdll.TraverseCDLL();
	}

}
