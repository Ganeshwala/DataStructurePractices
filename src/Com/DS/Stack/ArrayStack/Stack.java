package Com.DS.Stack.ArrayStack;

public class Stack {

	int[] arr;
	int topOfStack;
	
	/*
	 * Create Stack Using Array
	 * Creating of Stack while Create & initializing class variable
	 */
	public Stack(int size) {
		arr = new int[size];
		topOfStack=-1;
		System.out.println("Stack is Created");
	}
	
	/*
	 * isEmpty() method return type boolean
	 * Checking stack is empty or not
	 */
	public boolean isEmpty() {
		if(topOfStack==-1) {
			System.out.println("Stack is Empty");
			return true;
		}
		else {
			return false;
		}
	}
	
	/*
	 * isFull() method return type boolean
	 */
	public boolean isFull() {
		if(topOfStack==arr.length-1) {
			System.out.println("Stack is Full");
			return true;
		}
		else {
			return false;
		}
	}
	
	/*
	 * insert element in Stack 
	 * push() method is use to insert element in stack, return type is void
	 * increase value of topOfStack++ and insert element in array
	 */
	public void push(int value) {
		if(isFull()) {
			//System.out.println("Stack is full! ,First Delete element");
			return ;
		}
		else {
			arr[topOfStack+1]=value;
			topOfStack++;
			System.out.println(arr.toString());
		}
	}
	
	/*
	 * delete element from stack
	 * pop() method is use to remove top element from stack and display on screen
	 * return type int dataType of Stack
	 * decrease size of array and decrease value of topOfStack as well
	 */
	public int pop() {
		if(isEmpty()) {
			//System.out.println("Stack is Empty");
			return -1;
		}
		else {
			int deleteTopElement=arr[topOfStack];
			topOfStack--;
			return deleteTopElement;
		}
	}
	
	/*
	 * only display first element of stack
	 * peek() method is use for that
	 * this will only show top element of stack did not remove from stack
	 * return type is dataType of Stack
	 */
	public int peek() {
		if(isEmpty()) {
			//System.out.println("Stack is Empty");
			return -1;
		}
		else {
			int topElement=arr[topOfStack];
			return topElement;
		}
	}
	
}
