package Com.DS.LinkedList.DoubleLinkedList;

public class DoubleLinkedList {

	DoubleNode head,tail;
	public int size;
	
	public DoubleNode createLinkeLidt(int nodeValue) {
		DoubleNode node= new DoubleNode();
		node.value=nodeValue;
		head=node;
		tail=node;
		node.next=null;
		node.previous=null;
		size++;
		return head;
	}
	
	public void insertDLL(int nodeValue,int location) {
		DoubleNode newNode= new DoubleNode();
		newNode.value=nodeValue;
		if(head==null) {
			createLinkeLidt(nodeValue);
			return;
		}
		else {
			if(location==0) {
				newNode.next=head;
				head.previous=newNode;
				newNode.previous=null;
				head=newNode;
			}
			else if(location >=size) {
				newNode.next=null;
				tail.next=newNode;
				newNode.previous=tail;
				tail=newNode;
			}
			else {
				DoubleNode tempNode=head;
				for(int i=0;i<location-1;i++) {
					tempNode=tempNode.next;
				}
				newNode.next=tempNode.next;
				tempNode.next.previous=newNode;
				tempNode.next=newNode;
				newNode.previous=tempNode;
			}
			size++;
		}
	}
	
	public void TraversDLL() {
		DoubleNode tempNode = head;
		for(int i=0;i<size;i++) {
			System.out.print(tempNode.value);
			if(tempNode.next!=null) {
				System.out.print("->");
			}
			tempNode=tempNode.next;
		}
		System.out.println();
		DoubleNode reverseNode=tail;
		for(int i=0;i<size;i++) {
			System.out.print(reverseNode.value);
			reverseNode=reverseNode.previous;
			if(i!=size-1) {
				System.out.print("<-");
			}
		}
		System.out.println();
	}
	
	public void SearchValue(int value) {
		DoubleNode tempNode=head;
		for(int i=0;i<size;i++) {
			if(tempNode.value==value) {
				System.out.println("Value found at location"+i);
			}
			tempNode= tempNode.next;
		}
		DoubleNode reveserNode=tail;
		for(int j=0;j<size;j++) {
			if(reveserNode.value==value) {
				System.out.println("reverser at"+j);
			}
			reveserNode=reveserNode.previous;
		}
	}
	
	public void DeleteDLL(int location) {
		if(head==null) {
			System.out.println("list is empty");
			return ;
		}
		else {
			if(location==0) {
				if(size==1) {
					head=null;tail=null;
				}else {
					head=head.next;
					head.previous=null;
				}
			}
			else if(location >=size) {
				if(size==1) {
					head=null;tail=null;
				}else {
					tail=tail.previous;
					tail.next=null;
				}
			}else {
				DoubleNode tempNode=head;
				for(int i=0;i<location-1;i++) {
					tempNode=tempNode.next;
				}
				tempNode.next=tempNode.next.next;
				tempNode.next.previous=tempNode;
			}
			size--;
		}
	}
}
