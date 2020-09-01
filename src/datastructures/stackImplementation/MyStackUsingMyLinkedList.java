package stackImplementation;

import linkedListImplementation.MyLinkedList;

public class MyStackUsingMyLinkedList<E> {
	
	private MyLinkedList<E> myLL = new MyLinkedList<E>();
	
	void push(E e) {
		myLL.add(e);
	}
	
	E pop() throws Exception {
		return myLL.removeLast();
	}
	
	E peek() throws Exception {
		return myLL.getLast();
	}
}
	
	
