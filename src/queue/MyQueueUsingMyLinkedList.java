package queue;

import linkedListImplementation.MyLinkedList.*;

public class MyQueueUsingMyLinkedList<E> {
	
	private Node<E> head, rear;
	
	public void enqueue(E e) {
		Node<E> toAdd = new Node<E>(e);
		
		if(head == null) {
			head = rear = toAdd;
		}
		rear.next = toAdd;
		rear = rear.next;
	}
	
	public E dequeue() {
		
		if(head == null) {
			return null;
		}
		Node<E> toRemove = head;
		head = head.next;
		if(head == null) {
			rear = null;
		}
		return toRemove.data;
		
	}
	
	public E peek() {
		Node<E> returned = head;
		return returned.data;
	}

}
