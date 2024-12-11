package SESenior.course.demo.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * 
 * Collection -- ArrayList
 *
 */

public class Class1 {
	@SuppressWarnings({"rawtypes", "unchecked" })
	public static void main(String[] args) {
		//ArrayList (����ṹ�ļ���)
		User user = new User();
		
		/*
		 	���ݽṹ
		 	��
		 	ջ
		 	����
		 	����
		 */
		
		ArrayList arrayList = new ArrayList();
		
		//�ַ���
		arrayList.add("a");
		arrayList.add("b");
		arrayList.clear();  //���
		arrayList.add("c");
		//����
		arrayList.add(user);
		//boolean
		arrayList.add(false);
		//float
		arrayList.add(3.1415);
		//���뼯�ϲ�ͬ�����ͣ�ȡ��ʱ����object���ͣ�Ҳ����˵��ʧȥԭ������
		
		
		
		/*demo1(arrayList);
		demo2(arrayList);*/
		// demo3(arrayList);
		demo5(arrayList);
	}
	
	@SuppressWarnings({ "rawtypes", "unused" })
	public static void demo(){
		//java������������ 8 ��
		//byte,short,int,long,float,double,char,boolean
		int[] arr = new int[10];  //����
		
		//java����ֻ�ܴ����
		Collection collection;
		//set list
		
		//set -- һ���������ظ�Ԫ�ص�collection
		//list -- �����collection��Ҳ��Ϊ���У��������ظ���Ԫ��
	}
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void demo1(ArrayList arrayList){
		//���
		//Ĭ��10���Զ�����
		for(int i=0; i<10; i++){
			arrayList.add(i);
		}
		
		arrayList.remove(0);  //���±�ɾ��
		System.out.println("���ϴ�С" + arrayList.size());
		
		//ѭ����������0�����ϵĴ�С
		for(int i=0; i<arrayList.size(); i++){
			//get��int index�������б�ָ��λ�õ�Ԫ��
			//��ȡ�����е�Ԫ��
			Object value = arrayList.get(i);
			System.out.println(value);
		}
		
		//�ж��Ƿ����ĳ��Ԫ��
		boolean exist = arrayList.contains("c");
		System.out.println("exist:" + exist);
	}
	
	@SuppressWarnings("rawtypes")
	public static void demo2(ArrayList arrayList){
		//�����������и�����Collection�ļ��϶��е�������
		Iterator iterator = arrayList.iterator();  //����һ��������
		System.out.println(iterator.next());  //���ص�ǰ�����ƶ�����һ��λ�ã�
		//������쳣
		System.out.println(iterator.hasNext());  //�Ƿ�����һ��ָ��
		
		//����������
		while(iterator.hasNext()){  //�����������Ԫ�أ��ͷ���true��û�з���false
			System.out.println("��");
			Object obj = iterator.next();
			System.out.println("iterator = " + obj);
			
			//System.out.println("��" + iterator.next());
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void demo3(ArrayList arrayList){
		for(Object obj : arrayList){
			System.out.println(obj);
		}
	}
	
	@SuppressWarnings("unused")
	public static void demo4(){
		//��װ���Զ����
		// int -- Integer
		int x = 10;
		Integer y = 20;
		double d1 = 1;
		Double d2 = 2d;
		
		// �����������Ͷ�Ӧ�Ķ�����
		Byte b;
		Short s;
		Long l;
		Float f;
		Boolean b1;
		Character ct;
		
		//�����������ͣ�ת�ɶ�Ӧ�Ķ������ͣ�װ�䣩
		Integer xObj = Integer.valueOf(x);
		// Double.valuef(arg0);
		// Float.valuef(arg0);
		
		//�������ͣ�ת�ɻ����������ͣ����䣩
		int xValue = xObj.intValue();
		
		//����demo4_1
		demo4_1(10);  //�Զ���װ��
	}
	
	public static void demo4_1(Integer value){
		
	}
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void demo5(ArrayList arrayList){
		System.out.println("index0=" + arrayList.get(0));
		arrayList.remove(0);
		System.out.println("index0=" + arrayList.get(0));
		
		//��ĳ���±��
		arrayList.add(0, "rrr");
		System.out.println("index0=" + arrayList.get(0));
	}
}
