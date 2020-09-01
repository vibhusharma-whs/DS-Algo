package queue;

public class QueueExample {
	
	public static void main(String[] args) {
		MyQueueUsingMyLinkedList<Integer> myQ = new 		MyQueueUsingMyLinkedList<Integer>();
		myQ.enqueue(25);
		myQ.enqueue(45);
		myQ.enqueue(6);
		myQ.enqueue(65);
		
		System.out.println(myQ.dequeue());
		System.out.println(myQ.peek());
	}

}
