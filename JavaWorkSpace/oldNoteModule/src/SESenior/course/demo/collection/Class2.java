package SESenior.course.demo.collection;

import java.util.Iterator;
import java.util.LinkedList;

/**
 * 
 * Collection -- LinkedList
 *
 */

public class Class2 {
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		LinkedList linkedlist = new LinkedList();
		
		linkedlist.add(1);  //Collection�ӿڵķ���
		linkedlist.add("b");
		
		linkedlist.iterator();
		linkedlist.addFirst("first");
		
		//�Ӷ�ջ��������һ��Ԫ��
		Object value = linkedlist.pop();
		
		System.out.println(linkedlist.getFirst());
		System.out.println(value);
		System.out.println(linkedlist.getLast());
		
		linkedlist.addAll(linkedlist);
		
		Iterator iterator = linkedlist.iterator();
		
		while(iterator.hasNext()){
			System.out.println(iterator.next());
		}
		
		linkedlist.add(3, "add_3_value");
		System.out.println(linkedlist.get(3));
		//���±�Խ��
		
		//LinkedList��ַ�����Ƿ������Ŀռ��ַ�������������ģ�
		//LinkedList��ѯ����Ҫ���������е�Ԫ�أ��ҵ�ָ��ֵ�����أ�Ч�ʵ�
		//LinkedList
		/*linkedlist.add(3);
		System.out.println(linkedlist.get(3));*/
	}
}
