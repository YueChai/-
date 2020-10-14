package 双链表;

public class CirDoubleList<T> {
	//表头
	public DNode<T> head;
	
	//节点个数
	private int Count;
	
	//定义节点结构体
	class DNode<T>{
		private DNode pre;    //链接前一个节点
		private DNode next;   //链接下一个节点
		private T value;      //节点值
		
		public DNode(T value, DNode pre, DNode next) {
			this.next = next;
			this.pre = pre;
			this.value = value;
		}
	}
	
	//构造函数
	public CirDoubleList() {
		//创建头节点并制为null。（头节点为空节点）
		head = new DNode<T>(null, null, null);
		head.next = head.pre = head;
		Count = 0;
	}
	
	//返回节点个数
	public int size() {
		return Count;
	}
	
	//判断双链表是否为空
	public boolean isEmpty() {
		return Count == 0;
	}
	
	//返回index位置的节点
	public DNode<T> getNode (int index){
		if(index <= 0 || index > Count) 
			throw new IndexOutOfBoundsException();
		
		//正向查找
		if(index <= Count/2) {
			DNode<T> node = head.next;  //指向首节点
			for(int i = 1; i < index; i++) {
				node = node.next;
			}
			return node;
		}
		
		//反向查找
		DNode<T> node = head.pre;    //指向尾节点
		int rindex = Count - index;
		for(int j = 0; j < rindex; j++) {
			node = node.pre;
		}
		return node;
	}
	
	//获取第index位置的节点值
	public T get(int index) {
		return getNode(index).value;
	}
	
	//获取第一个节点的值
	public T getFirst() {
		return getNode(1).value;
	}
	
	//获取最后一个节点的值
	public T getLast() {
		return getNode(Count).value;
	}
	
	//将节点t插入到index位置
	public void insert(int index, T t) {
		if(index == 1) {
			DNode<T> tnode = new DNode<T>(t, head, head.next);
			head.next.pre = tnode;
			head.next = tnode;
			Count++;
			return;
		}
		 DNode<T> inode = getNode(index);
		 DNode<T> tnode = new DNode<T>(t, inode.pre, inode);
		 inode.pre.next = tnode;
		 inode.pre = tnode;
		 Count++;
		 return ;
	}
	
	 // 将节点追加到链表的末尾
	    public void appendLast(T t) {
	       DNode<T> node = new DNode<T>(t, head.pre,head);
	       head.pre.next = node;
	       head.pre = node;
	       Count++;
	    }
	     
	  //打印全部节点
	     public void print() {
	    	 for(int i = 1; i <= Count; i++) {
	    		 System.out.println(getNode(i).value);
	    	 }
	     }
	   
	  //删除index位置的节点
	   public void delete(int index) {
		   DNode<T> node = getNode(index);
		   node.next.pre = node.pre;
		   node.pre.next = node.next;
		   node = null;
		   Count--;
	   }
	   
	public static void main(String[] args) {
		CirDoubleList<String> dl = new CirDoubleList<String>();
		try {
			//按顺序依次插入节点1,2,3,4
			System.out.println("依次插入节点1、2、3、4：");
			dl.appendLast("1");
			dl.appendLast("2");
			dl.appendLast("3");
			dl.appendLast("4");
			dl.print();
			System.out.println("节点个数为："+dl.Count);
			
			//在双链表第4个节点处插入一个节点7
			System.out.println("\n"+"在双链表第4个节点处插入一个节点7：");
			dl.insert(4, "7");
			dl.print();
			System.out.println("节点个数为："+dl.Count);
			
			//删除第3个节点
			System.out.println("\n"+"删除第3个节点");
			dl.delete(3);
			dl.print();
			System.out.println("节点个数为："+dl.Count);
			
			//打印双链表
			System.out.println("\n"+"打印双链表：");
			dl.print();	
			System.out.println("节点个数为："+dl.Count);
			System.out.println("双链表是否为空："+dl.isEmpty());
			
		}catch(IndexOutOfBoundsException e) {
			e.getStackTrace();
		}
		
	}
}
