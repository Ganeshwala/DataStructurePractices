package Com.DS.LinkedList.CircularDoublyLinkedList;

public class CircularDoublyLinkedList {

	Node head,tail;
	int size;
	
	public Node createCircularDoublyLinked(int nodeValue) {
		Node tempNode= new Node();
		tempNode.value=nodeValue;
		head=tempNode;
		tail=tempNode;
		tempNode.next=tempNode;
		tempNode.prev=tempNode;
		size++;
		return head;
	}
	
	public void InsertCDLL(int nodeValue,int location) {
		Node newNode= new Node();
		newNode.value=nodeValue;
		if(head==null) {
			createCircularDoublyLinked(nodeValue);
			return;
		}
		else {
			if(location==0) {
				newNode.next=head;
				newNode.prev=tail;
				head.prev=newNode;
				tail.next=newNode;
				head=newNode;
			}
			else if(location>=size) {
				newNode.next=head;
				newNode.prev=tail;
				head.prev=newNode;
				tail.next=newNode;
				tail=newNode;
			}
			else {
				Node tempNode = head;
				for(int i=0;i<location-1;i++) {
					tempNode=tempNode.next;
				}
				newNode.prev=tempNode;
				newNode.next=tempNode.next;
				tempNode.next=newNode;
				tempNode.next.prev=newNode;
			}
			size++;
		}
	}
	
	public void TraverseCDLL() {
		Node tempNode = head;
		for(int i=0;i<size;i++) {
			System.out.print(tempNode.value);
			if(i!=size-1) {
				System.out.print("->");
			}
			tempNode=tempNode.next;
		}
		System.out.println();
	}
	
	public void DeleteCDLL(int location) {
		if(head==null) {
			System.out.println("Linked list is empty");
			
		}
		else {
			if(location==0) {
				if(size==1) {
					head=null;
					tail=null;
					head.next=null;
					head.prev=null;
				}
				else {
					head=head.next;
					head.prev=tail;
					tail.next=head;
				}
			}
			else if(location >=size) {
				if(size==1) {
					head=null;
					tail=null;
					head.next=null;
					head.prev=null;
				}else {
					tail=tail.prev;
					tail.next=head;
					head.prev=tail;
				}
			}
			else {
				Node tempNode = head;
				for(int i=0;i<location-1;i++) {
					tempNode=tempNode.next;
				}
				tempNode.next=tempNode.next.next;
				tempNode.next.prev=tempNode;
			}
			size--;
		}
	}
}
