package 双链表;

public class Main {
	public static void main(String[] args) {
		DoublyList dl=new DoublyList();
		dl.insertfirst(11);
		System.out.println(dl.toString());
		
		dl.insertLast(33);
		dl.insertLast(66);
		System.out.println(dl.toString());
		System.out.println(dl.isEmpty());
		
		System.out.println("----------------------------");
		
		CirDoublyList cl=new CirDoublyList();
		cl.insert(22);
		cl.insert(33);
		cl.insert(44);
		/*
		 * System.out.println("打印双链表"+"\n"); cl.print();
		 * System.out.println("节点个数为："+cl.size());
		 */
	
		System.out.println(cl.getNode(1));
		System.out.println(cl.getNode(2));
		System.out.println(cl.isEmpty());

	}
	
	
}
