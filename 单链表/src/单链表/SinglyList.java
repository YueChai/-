package 单链表;

public class SinglyList<T> {
	public Node<T> head;
	
	public SinglyList() {
		this.head=new Node<T>();
	}
	
	public SinglyList(T[] values) {
		this();
		Node<T> rear=this.head;
		for (int i = 0; i < values.length; i++) {
			if(values[i]!=null) {
				rear.next=new Node<T>(values[i],null);
				rear=rear.next;
			}
			
		}
	}
	//判断是否为空
	public boolean isEmpty() {
		return this.head.next==null;
	}
	
	//取出下标为i的元素
	public T get(int i) {
		Node<T> p=new Node<T>();
		for (int j = 0; j < i && p!=null; j++) {
			p=p.next;
		}
		return (i>=0 && p!=null) ?p.data :null;
	}
	
	public void set(int i,T x) {
		
	}
	public int size() {
		
		
		int size = 0;
	    Node CurrNode = head;
	    while(CurrNode.next != null)
	    {
	        CurrNode = CurrNode.next;
	        size++;     
	    }
	    return size; 
		
		
		
	}
	
	public String toString() {
		String str=this.getClass().getName()+"(";
		for (Node<T> p=this.head.next;p!=null;p=p.next) {
			str+=p.data.toString()+(p.next!=null ? ",":"");
		}
		return str+")";
	}
	
	//插入方法
	public Node<T> insert(int i,T x){
		if(x==null) {
			return null;
		}
		Node<T> front =this.head;
		for (int j = 0; front.next!=null && j <i ; j++) {
			front=front.next;
		}
		front.next=new Node<T>(x,front.next);
		return front.next;
	}
	
	public Node<T> insert(T x){
		return insert(Integer.MAX_VALUE,x);
	}
	
	//清除所有元素
	public void clear() {
		this.head.next=null;
	}
	
	//删除方法
	public T remove(int i) {
		Node<T> front =this.head;
		for (int j = 0; j < i && front.next!=null; j++) {
			front=front.next;
		}
		if(i>0 && front.next!=null) {
			T x=front .next.data;
			front.next=front.next.next;
			return x;
		}
		return null;
		
	}
	//求平均值
	public static double average(SinglyList<Integer> list) {
		int sum=0;
		for (int i = 0; i < list.size(); i++) {
			sum+=list.get(i).intValue();
			
		}
		return (double) sum/list.size();
	}
	
	//单链表的集合并运算
	
	
	
}
