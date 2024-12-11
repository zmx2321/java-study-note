package SESenior.video.note.LinkedList;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo1 {
	public static void main(String[] args) {
		//�ӿڵ����ñ�������ʵ�������
		
		//LinkedList���ڲ���װ����˫���������ݽṹ
		//ÿ���ڵ���һ��node����node�����з�װ������Ҫ��ӵ�
		//Ԫ�أ�����һ��ָ����һ��node�����Ӧ��ָ����һ��node���������
		
		/*
		 *  ��ͬ�������в�ͬ�����ݽṹ����ͬ�����ݽ��
		 *  �������������ǲ�һ����
		 *  
		 *  �������ݽṹ�������룬ɾ����Ч�ʱȽϸߣ���
		 *  ��ѯЧ�ʱȽϵ�
		 *  
		 *  ����ṹ������ѯ��ʱ��Ч�ʸߣ���Ϊ����ͨ���±�
		 *  ֱ���ҵ�Ԫ�أ��������ɾ��Ч�ʱȽϵͣ���ΪҪ����λ����
		 */
		
		//����һ������
		LinkedList<String> sList = new LinkedList<>();
		
		//���
		sList.add("����");
		sList.add("����");
		sList.add("����");
		sList.add("jack");
		
		//���б�ͷ�����
		sList.addFirst("ccc");
		//���б�ͷ��ɾ��(��һ��Ԫ��)
		sList.removeFirst();  //���Ϊ���׳��쳣
		
		//���б�ĩβ���
		sList.addLast("ddd");
		//���б�β��ɾ��(���һ��Ԫ��)
		sList.removeLast();  //���Ϊ���׳��쳣
		
		//���
		sList.clear();
		
		//sList.removeFirst();  //���Ϊ���׳��쳣  NoSuchElementException
		System.out.println(sList.pollFirst());  //���Ϊ�շ���null
		//last��ͬ
		
		//����������������
		Iterator<String> it = sList.iterator();
		while(it.hasNext()){  //�������ж���û����һ��Ԫ��
			String name = it.next();
			System.out.println(name);
		}
		
		System.out.println("-**-**-**-");
		
		//����(��ǿforѭ��)ֻҪʵ����Iterator�ӿھ�������ǿforѭ��
		for(String name:sList){
			System.out.println(name);
		}
	}
}
