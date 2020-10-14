package 单链表;

public class Node<T> extends Object {
	public T data;
	public Node<T> next;
	public Node(T data,Node<T> next ) {
		this.data=data;
		this.next=next;
	}
	
	public Node() {
		this(null, null);
	}
	public Node(T data) {
		this.data = data;
	}
	
	public String toString() {
		return this.data.toString();
	}
	
}
