package Com.DS.LinkedList;

public class CircularSinglyLinkedList {

	public Node head,tail;
	public int size;
	
	/*
	 * Create only one node and it refer itself.
	 */
	public Node createCircularSinglyLinkedList(int nodeValue) {
		head = new Node();
		Node node = new Node();
		node.value=nodeValue;
		node.next=node;
		head=node;
		tail=node;
		size=1;
		return head;
	}
}
