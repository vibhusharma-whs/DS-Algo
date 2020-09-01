package linkedListImplementation;

public class MyLinkedList<E> {
	
	Node<E> head;
	
	public void add(E data) {
		Node<E> toAdd = new Node<E>(data);
		
		if (isEmpty()) {
			head = toAdd;
			return;
		}
		Node<E> temp = head;
		while (temp.next!=null) {
			temp = temp.next;
		}
		temp.next = toAdd;
	}
	
	public boolean isEmpty() {
		return head == null;
	}
	
	public E removeLast() throws Exception {
		
		Node<E> temp = head;
		
		if(isEmpty()) {
			throw new Exception("Can not remove element from empty list");
		}
		
		if(temp.next == null) {
			Node<E> toRemove = temp;
			head = null;
			return toRemove.data;
		}

		while(temp.next.next != null) {
			temp=temp.next;
		}
		
		Node<E> toRemove = temp.next;
		temp.next = null;
		return toRemove.data;
	}
	
	public E getLast() throws Exception {
		
		Node<E> temp = head;
		
		if(isEmpty()) {
			throw new Exception("Can not peek last element from empty list");
		}

		while(temp.next != null) {
			temp=temp.next;
		}
		
		return temp.data;
	}
	
	void print() {
		if (isEmpty()) {
			System.out.println("Empty List");
		}
		Node<E> temp = head;
		while (temp!=null) {
			System.out.print(temp.data+" ");
			temp = temp.next;
		}
	}
	
	void get(int index) throws Exception {
		if(index<0) {
			throw new Exception("Error - Index can not be negative.");
		}
		Node<E> temp = head;
		
		if (isEmpty()) {
			System.out.println("List already empty");
			return;
		}
		for (int i =0;i<index;i++) {
			temp = temp.next;	
		}
		System.out.println(temp.data);
	}
	
	public static class Node<E> {
		public E data;
		public Node<E> next;
		
		public Node(E data) {
			this.data = data;
			this.next = null;
		}
	}

}
