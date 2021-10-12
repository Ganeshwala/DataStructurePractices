package Com.DS.LinkedList.DoubleLinkedList;

public class DoubleLinikedListMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DoubleLinkedList dll = new DoubleLinkedList();
		dll.createLinkeLidt(5);
		System.out.println(dll.head.value);
		dll.insertDLL(8, 2);
		System.out.println(dll.head.value);
		System.out.println(dll.head.next.value);
		dll.insertDLL(7, 1);
		System.out.println(dll.head.next.value);
		
		// display list using head and tail (reverse order)
		dll.TraversDLL();
		
		//searching value
		dll.SearchValue(5);

		//delete node
		dll.DeleteDLL(1);
		
		dll.TraversDLL();
	}

}
