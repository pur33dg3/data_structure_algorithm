package dsa;

public class LinkedStack<E> {
	private SingularlyLinkedList<E> list = new SingularlyLinkedList<>(); // an empty list

	public LinkedStack() {
	} // new stack relies on the initially empty list

	public int size() {
		return list.size();
	}

	public boolean isEmpty() {
		return list.isEmpty();
	}

	public void push(E element) {
		list.addFirst(element);
	}

	public E top() {
		return list.first();
	}

	public E pop() {
		return list.removeFirst();
	}
}
