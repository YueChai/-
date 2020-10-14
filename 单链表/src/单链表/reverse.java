package 单链表;

public class reverse {
	public static void main(String[] args) {
		RNode head = new RNode(0);
		RNode node1 = new RNode(1);
		RNode node2 = new RNode(2);
		RNode node3 = new RNode(3);
		
		head.setNext(node1);
		node1.setNext(node2);
		node2.setNext(node3);
		
		// 打印反转前的链表
				RNode h = head;
				while (null != h) {
					System.out.print(h.getData() + " ");
					h = h.getNext();
				}
		//打印反转之后的链表
				System.out.println();
				head = reverse(head);
				while (null != head) {
					System.out.print(head.getData() + " ");
					head = head.getNext();
				}


	}
	public static RNode reverse(RNode head) {
		if(head==null) {
			return head;
		}
		RNode pre=head;
		RNode cur=head.getNext();
		RNode tmp;
		while(cur!=null) {
			tmp = cur.getNext();
			cur.setNext(pre);// 反转指针域的指向
			//向下移动
			pre = cur;
			cur = tmp;
			head.setNext(null);
		}
		return pre;
	}
}
