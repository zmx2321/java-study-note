package SESenior.video.note.Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsDemo {
	public static void main(String[] args) {
		//ʵ����һ������
		List<String> nList = new ArrayList<>();
		
		//���
		//list������ظ�
		nList.add("zhangsan");
		nList.add("lisi");
		nList.add("wangwu");
		nList.add("zhaoliu");
		
		//����
		System.out.println("��ʼ��");
		for(String name:nList){
			System.out.print(name + " ");
		}
		
		System.out.println("\n***");
		
		//����˳��
		System.out.println("����˳��");
		Collections.swap(nList, 1, 2);
		for(String name:nList){
			System.out.print(name + " ");
		}
		
		System.out.println("\n***");
		
		//����˳��
		System.out.println("��Ȼ����");
		Collections.sort(nList);
		for(String name:nList){
			System.out.print(name + " ");
		}
		
		System.out.println("\n***");
		
		//���ַ�����
		System.out.println("���ַ����ң�");
		//Collections.sort(nList);  �������������ʹ�ö��ַ�����
		System.out.println(Collections.binarySearch(nList, "zhaoliu"));
		
		System.out.println("\n***");
		
		//����˳��
		System.out.println("����˳��");
		Collections.shuffle(nList);
		for(String name:nList){
			System.out.print(name + " ");
		}
		
		System.out.println("\n***");
		
		//���(����)
		System.out.println("��䣺");
		Collections.fill(nList, "333");
		for(String name:nList){
			System.out.print(name + " ");
		}
	}
}
