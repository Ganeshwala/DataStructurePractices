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
	
	public void insertNode(int newNodeValue,int location) {
		Node node= new Node();
		node.value=newNodeValue;
		if(head==null) {
			createCircularSinglyLinkedList(newNodeValue);
			return;
		}
		else if(location==0) {
			node.next=head;
			head=node;
			tail.next=node;
			System.out.println("Node is create at first position");
		}
		else if(location >=size) {
			tail.next=node;
			tail=node;
			tail.next=head; // node.next=head 
			System.out.println("Node create at last position");
		}
		else {
			Node tempNode = new Node();
			tempNode=head;
			int index=0;
			while(index<location-1) {
				tempNode=tempNode.next;
				index++;
			}
			node.next=tempNode.next;
			tempNode.next=node;
		}
		size++;
	}
}
