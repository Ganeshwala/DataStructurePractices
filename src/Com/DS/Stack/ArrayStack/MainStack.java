package Com.DS.Stack.ArrayStack;

public class MainStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Stack str = new Stack(5);
		str.isEmpty();
		
		str.isFull();
		
		str.push(5);
		str.push(10);
		str.push(4);
		str.push(8);
		str.push(3);
		str.push(0);
		
		int deleteStackValue =str.pop();
		System.out.println("remove element from stack"+deleteStackValue);
		int deleteStackValue1 =str.pop();
		System.out.println("remove element from stack"+deleteStackValue1);
		
		System.out.println("first emelent of Stack is: "+str.peek());
		
	}

}
