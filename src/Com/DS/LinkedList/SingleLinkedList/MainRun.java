package Com.DS.LinkedList.SingleLinkedList;

public class MainRun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("start");
		SingleLinkedList list = new SingleLinkedList();
		list.createSingleLinkedList(5);
		list.insertNode(6);
		list.insertNode(8);
		list.insertNode(4, 0);
		list.insertNode(9, 5);
		list.insertNode(7, 3);
		list.printList();
		list.deleteNode(0);
		list.printList();
	}

}
