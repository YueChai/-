package 双链表;

public class DoublyList {
	 private DoubleNode first;
	 private DoubleNode last;
	 public DoublyList(){
	        first = null;
	        last = null;
	    }
	 /**
	  * 插入数据 头插入
	  *
	  */
	 public void insertfirst(int value) {
		 DoubleNode newNode=new DoubleNode(value);
		 if(first==null) {
			last=newNode;
		 }else {
			 first.prev=newNode;
			 newNode.next=first;
		 }
		 first=newNode;
	 }
	 
	 /**
	     * 尾插入数据
	     * @param value
	     */
	    public void insertLast(int value){
	        DoubleNode newNode = new DoubleNode(value);
	        if (first == null) {
	            first = newNode;
	        }else {
	            last.next = newNode;
	            //first.previous = newNode;
	            newNode.prev = last;
	        }
	        //把最后个节点设置为最新的节点
	        last = newNode;
	    }
	    
	    public boolean isEmpty(){
	        return first == null;
	    }

	    /**
	     * 显示所有的数据
	     * @return 
	     */
	    public String display(){
	        if (first == null) {
	            throw new RuntimeException("链表数据不存在");
	        }
	        
	    		String str=this.getClass().getName()+"(";
	    		for (DoubleNode p=this.first.next;p!=null;p=p.next) {
	    			str+=p.data.toString()+(p.next!=null ? ",":"");
	    		}
	    		return str+")";
	    	
	       
	    }

	    
}
