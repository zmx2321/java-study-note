package SESenior.video.note.ArrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo1 {
	public static void main(String[] args) {
		//alt+/ --> ���ٵ��� (ctrl+shift+o)
		//ArrayList�������һ������
		//����һ��ArrayList����
		//ArrayList<String> nList = new ArrayList<String>();  //import java.util.ArrayList;
		//Ҳ�����ýӿڵ����ñ�������ʵ�ֵĶ���
		/**
		 * �����ǵ����޲ι��췽��������һ��ArrayList�����ʱ��������
		 * �ڲ�����һ����ʼ��СΪ10��һ��object��������
		 * ����ӵ�����������������Ĵ�С��ʱ�򣬻����һ���µ����飬
		 * �µ������СΪԭ�������С��1.5�������ţ���ԭ�����е�����
		 * �������µ�������
		 */
		List<String> nList = new ArrayList<String>();  //Ҫ�����import java.util.List;
		//����ַ���(�����޶���)
		nList.add("����");
		nList.add("lisi");
		nList.add("ZMX");
		nList.add("zmx");
		//����(���뵽ָ��λ��)
		nList.add(0, "132"); //��һ������(0)��ʾ�±�
		nList.add(1, "123");
		//�滻
		nList.set(0, "wangwu");  //��һ������(0)��ʾ�±�
		
		//�õ�����������������ݽ��б���(����̳��˸���)
		System.out.println("ʹ�õ������������ͳһ�ı���");
		Iterator<String> it = nList.iterator();
		
		//�ж���û����һ��Ԫ�أ��еĻ�����true
		while(it.hasNext()){
			String name = it.next();  //next��ʾȡ����һ��Ԫ��
			System.out.println(name);
		}
		
		//����ǿforѭ�����б���
		System.out.println("����ǿforѭ�����б���");
		for(String name:nList){
			System.out.println(name);
		}
		
		//��������
		System.out.println("*******");
		//indexOf(���ش��б����״γ��ֵ�ָ��Ԫ�ص��������Ҳ�������-1)
		System.out.println(nList.indexOf("lisi"));
		//ɾ���״γ��ֵ��ַ���
		System.out.println(nList.remove("lisi"));  //���ز���
		System.out.println(nList.remove(0)); //���������������ַ�����
		//����Ԫ������
		System.out.println(nList.size());
		//�鿴�Ƿ����ָ��Ԫ��
		System.out.println(nList.contains("zmx"));
		//�����б�ָ��λ�õ�Ԫ��
		System.out.println(nList.get(0));
		//���
		nList.clear();
		//�ж��Ƿ�Ϊ��
		System.out.println(nList.isEmpty());
	}
}
