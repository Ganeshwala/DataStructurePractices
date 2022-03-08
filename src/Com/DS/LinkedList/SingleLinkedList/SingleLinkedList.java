package Com.DS.LinkedList.SingleLinkedList;

public class SingleLinkedList {

	Node head;
	Node tail;
	int size;

	public Node createSingleLinkedList(int val) {
		Node tempNode = new Node();
		tempNode.val = val;
		tempNode.next = null;
		head = tempNode;
		tail = tempNode;
		size++;
		// System.out.println(head.val);
		return head;
	}

	public void insertNode(int val, int position) {
		Node newNode = new Node(val);
		if (position == 0) {
			newNode.next = head;
			head = newNode;
			// System.out.println("Insert Position"+head.val);
			size++;
		} else if (position >= size) {
			tail.next = newNode;
			tail = newNode;
			size++;
		} else {
			Node temp = head;
			int index = 0;
			while (index < position - 1) {
				temp = temp.next;
				//System.out.println("temp node val" + temp.val);
				index++;
			}
			newNode.next = temp.next;
			temp.next = newNode;
			size++;
		}
	}

	public void insertNode(int val) {
		Node newNode = new Node();
		newNode.val = val;
		tail.next = newNode;
		tail = newNode;
		// System.out.println("tails" + tail.val);
		size++;
	}

	public void printList() {
		Node temp = head;
		for (int i = 0; i < size; i++) {
			System.out.print(temp.val);
			if(i!=size-1) {
				System.out.print("->");
			}
			temp = temp.next;
		}
		System.out.println();
	}

	public void deleteNode(int position) {
		Node temp = head;
		if(position==0) {
			head=temp.next;
			size--;
			if(head==null) {
				tail=null;
			}
		}else if(position>=size) {
			for(int i=0;i<size-1;i++) {
				//System.out.println("temp"+temp.val);
				temp = temp.next;
			}
			if(temp == head) {
				tail = head = null;
				size--;
				return ;
			}
			temp.next=null;
			tail=temp;
			size--;
		}
		else{
			int index=0;
			while(index<position-1) {
				temp=temp.next;
				index++;
			}
			Node deleteNode = temp.next;
			temp.next=deleteNode.next;
			deleteNode.next=null;
			size--;
		}
	}
}
