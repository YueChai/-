package 双链表;

public class CirDoublyList<T> {
	public DoubleNode<T> head;
	private int count=0;
	public CirDoublyList() {
		this.head=new DoubleNode<T>();
		this.head.prev=this.head;
		this.head.next=this.head;
	}
	public boolean isEmpty() {
		return this.head.next==this.head;
	}
	//头插入或者尾插入或者中间插入
	public DoubleNode<T> insert(int i,T x){
		if(x==null) {
			return null;
			
		}else {
			DoubleNode<T> front=this.head;
			for (int j = 0; j < i && front.next!=this.head ; j++) {
				front=front.next;
			}
			DoubleNode<T> q=new DoubleNode(x,front,front.next);
			front.next.prev=q;
			front.next=q;
			count++;
			return q;
		}
	}
	//尾插入
	public DoubleNode<T> insert(T x){
		if(x==null) {
			return null;
		}else {
			DoubleNode<T> q=new DoubleNode<T>(x,head.prev,head);
			head.prev.next=q;
			head.prev=q;
			count++;
			return q;
		}
	}
	public DoubleNode<T> getNode (int index){
		if(index <= 0 || index > count) 
			throw new IndexOutOfBoundsException();
		
		//正向查找
		if(index <= count/2) {
			DoubleNode<T> node = head.next;  //指向首节点
			for(int i = 1; i < index; i++) {
				node = node.next;
			}
			return node;
		}
		
		//反向查找
		DoubleNode<T> node = head.prev;    //指向尾节点
		int rindex = count - index;
		for(int j = 0; j < rindex; j++) {
			node = node.prev;
		}
		return node;
	}
	public int size() {
		return count;
	}
	//遍历输出结果
	public void print() {
		for (int i = 0; i <=count; i++) {
			System.out.println(getNode(i));
		}
	}
}
