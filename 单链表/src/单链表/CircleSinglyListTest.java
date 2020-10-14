package 单链表;

public class CircleSinglyListTest {

	public static void main(String[] args) {
		CircleSinglyList cl=new CircleSinglyList();
		SNode head=new SNode(10,null);
		cl.addHead(head);
		cl.addTail(new SNode(33));
		cl.addTail(new SNode(44));
		cl.addTail(new SNode(55));
		cl.addTail(new SNode(66));
		cl.addTail(new SNode(77));
		
		//遍历一下结果
		cl.printList();
		//删除头节点
		System.out.println();
		System.out.println("-----------");
		cl.delHead();
		cl.printList();
		//删除头节点
		System.out.println();
				System.out.println("-----------");
				cl.delHead();
				cl.printList();
	}

}
