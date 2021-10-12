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
	
	public void TraverseLinkedList() {
		if(head!=null) {
			Node tempNode=head;
			for(int i=0;i<size;i++) {
				System.out.print(tempNode.value);
				if(i!=size-1) {
					System.out.print("->");
				}
				tempNode=tempNode.next;
			}
		}else {
			System.out.println("linked list is empty!!!!");
		}
		System.out.println();
	}
	
	public void searchNode(int searchValue) {
		Node tempNode=new Node();
		tempNode=head;
		for(int i=0;i<size;i++) {
			if(tempNode.value==searchValue) {
				System.out.println("Value found at position"+i);
			}
			tempNode=tempNode.next;
		}
	}
	
	public void deleteNode(int location) {
		if(head==null) {
			System.out.println("list not exist");
		}
		else if(location==0) {
			head=head.next;
			tail.next=head;
			size--;
			if(size==1) {
				tail=null;
				head.next=null;
				head=null;
			}
		}
		else if(location>=(size-1)) {
			Node tempNode=head;
			for(int i=0;i<size-1;i++) {
				tempNode=tempNode.next;
			}
			if(tempNode==head) {
				head.next=null;
				tail=null;
				head=null;
				size--;
			}
			tail=tempNode;
			tempNode.next=head;
			size--;
		}
		else {
			Node tempNode=head;
			for(int i=0;i<location-1;i++) {
				tempNode=tempNode.next;
			}
			tempNode.next=tempNode.next.next;
			size--;
		}
	}
}
