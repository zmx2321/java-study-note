/**
 * HashSetȥ��
 */

package SESenior.course.demo.linklistdemo;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class HashSetDemo {
	public static void main(String[] args) {
		//ʵ����List������������
		List<String> list = new ArrayList<>();
		
		//�����������������
		list.add("����");
		list.add("����");
		list.add("����");
		list.add("����");
		list.add("aaa");
		list.add("aaa");
		list.add("bbb");
		
		HashSet<String> other = new HashSet<>(list);
		
		for(String value : other){
			System.out.println(value);
		}
	}
}
