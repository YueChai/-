package 单链表;

public class reverse3 {
	public static void reversetList(Node head) {
		//如果当前链表为空，或者只有一个节点，无需反转，直接返回
		if(head.next == null || head.next.next == null) {
		return ;
		}
		Node cur = head.next;
		Node next = null;// 指向当前节点[cur]的下一个节点
		Node reverseHead = new Node(0,null);
		
		while(cur != null) {
			next = cur.next;//先暂时保存当前节点的下一个节点，因为后面需要使用
			cur.next = reverseHead.next;//将 cur 的下一个节点指向新的链表的最前端
			reverseHead.next = cur; //将 cur 连接到新的链表上
			cur = next;//让 cur 后移
			//将 head.next 指向 reverseHead.next , 实现单链表的反转
			head.next = reverseHead.next;
		}
		
		
}
	public static void main(String[] args) {
		reverse3 r3=new reverse3();
		Integer value [] = {1,2,3,4,5};
		SinglyList sl=new SinglyList<Integer>(value);
		r3.reversetList(sl.head);
		//输出一下结果
				while(sl.head.next!=null) {
					System.out.println(sl.head.next.data);
					sl.head=sl.head.next;
				}
	}
}
