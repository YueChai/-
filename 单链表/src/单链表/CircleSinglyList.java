package 单链表;

public class CircleSinglyList {
	private SNode head;
	private SNode tail;
	public int count;
	 public void CircularLinkedList() { // 构造函数用来初始化
	        tail = head = null;
	        count = 0;
	    }
	//在循环链表的头部插入节点
	 public void addHead(SNode hd) {
		 if (count == 0) {
	            hd.setNext(hd);
	            tail = head = hd;
	        } else {
	            tail.setNext(hd);
	            hd.setNext(head);
	            head = hd;
	        }
	        count++;
	 }
	 
	 //在循环链表的尾部插入节点
	 public void addTail(SNode t1) {
		 
		 if(count==0) {
			 t1.setNext(t1);
			 tail=head=t1;
		 }else {
			 tail.setNext(t1);
	         t1.setNext(head);
	         tail = t1;
		 }
		 count ++;
	 }
	 
	 public void printList() {
	        SNode nd = new SNode();
	        nd = head;
	        try {
	            while (nd.getNext() != head) {
	                System.out.print(nd.getData());
	                System.out.print("->");
	                nd = nd.getNext();
	            }
	            System.out.print(nd.getData());
	            System.out.print("->");
	            System.out.print(head.getData());
	        } catch (Exception e) {
	            e.printStackTrace();
	        }

	    }
	 
	 public void delHead() {
	        if (count > 1) {
	            head = head.getNext();
	            tail.setNext(head);
	            count--;
	        } else if (count == 1) {
	            head = tail = null;
	            count--;
	        } else {
	            System.out.println("There is no elements in the Circularlinked list.");
	        }

	    }

}
