package 单链表;

public class SNode {
	public int data;
	public SNode next;
	 public SNode(int data, SNode next) {
	        this.data = data;
	        this.next = next;
	    }
	 public SNode(int i) {
	        this(i, null);
	    }
	 public SNode() {
	        this(0, null);
	    }
	 public void setData(int data) {
	        this.data = data;
	    }
	 public int getData() {
	        return data;
	    }
	 public void setNext(SNode next) {
	        this.next = next;
	    }
	 public SNode getNext() {
	        return next;
	    }
	 

}
