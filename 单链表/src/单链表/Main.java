package 单链表;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		Integer[] values= {1,2,3,4};
		SinglyList<Integer> list1=new SinglyList<Integer>(values);
		System.out.println(list1.get(0)); 
		System.out.println(list1.isEmpty());
		System.out.println(list1.toString());
		System.out.println(list1.size());
		
		list1.insert(1, 99);
		//输出修改过后的单链表
		System.out.println(list1.toString());
		
		list1.insert(98);
		System.out.println(list1.toString());
		SinglyList<Integer> list2=new SinglyList<Integer>(values);
		
		//删除其中的几个元素
		list2.remove(1);
		System.out.println(list2.toString());
	}
}
