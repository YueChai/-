package 双链表;

public class DoubleNode<T> {
	public T data;
	public DoubleNode<T> prev ,next ;
	public DoubleNode(T data, DoubleNode<T> prev, DoubleNode<T> next) {
		this.data = data;
		this.prev = prev;
		this.next = next;
	}
	

	public DoubleNode(T data) {
		super();
		this.data = data;
	}


	public DoubleNode() {
		
	}


	@Override
	public String toString() {
		return  this.data.toString() ;
	}
	
	

	 
}
