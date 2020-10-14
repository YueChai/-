package 单链表;

public class RNode {
	private int Data;// 数据域
	private RNode Next;// 指针域
 
	public RNode(int Data) {
		
		this.Data = Data;
	}
 
	public int getData() {
		return Data;
	}
 
	public void setData(int Data) {
		this.Data = Data;
	}
 
	public RNode getNext() {
		return Next;
	}
 
	public void setNext(RNode node1) {
		this.Next = node1;
	}
}

