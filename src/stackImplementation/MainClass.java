package stackImplementation;

public class MainClass {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		MyStackUsingMyLinkedList<Integer> myStack = new 		MyStackUsingMyLinkedList<Integer>();
		
		myStack.push(234);
		myStack.push(34);
		myStack.push(21);
		myStack.push(76);
		myStack.push(878);
		int popped = myStack.pop();
		popped = myStack.pop();
		
		int peeked = myStack.peek();
		
		System.out.println(peeked);
		System.out.println(popped);
		
		

	}

}
