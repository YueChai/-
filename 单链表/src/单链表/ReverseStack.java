package 单链表;

import java.util.Stack;

public class ReverseStack {
	public static void reversePrint(Node head) {
		if(head.next == null) {
			return;//空链表，不能打印
		}
		//创建要给一个栈，将各个节点压入栈
		Stack<Node> stack = new Stack<Node>();
		Node cur = head.next;
		
		while(cur != null) {
			stack.push(cur);
			cur = cur.next; //cur 后移，这样就可以压入下一个节点
		}
		
		while (stack.size() > 0) {
			System.out.println(stack.pop()); //stack 的特点是先进后出
		}
		
		
		
		
	}
	public static void main(String[] args) {
		Integer value [] = {1,2,3,4,5};
		SinglyList sl=new SinglyList<Integer>(value);
		ReverseStack rs=new ReverseStack();
		rs.reversePrint(sl.head);
		
		
	}
}
