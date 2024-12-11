package SESenior.video.note.HashMap;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapDemo1 {
	public static void main(String[] args) {
		//ʵ����һ��map����
		//����ֵ�����ַ���
		HashMap<String, String> map = new HashMap<String, String>();
		
		map.put("yay", "����");
		map.put("yay", "����");
		map.put("rose", "õ��");
		
		//Ĭ��toString������ʽ{...}
		//����ֵͬ�ᱻ����
		System.out.println(map);
		
		//��ȡmap�����м�
		//ֻҪ�Ǽ̳���collection�඼����iterable������������ǿforѭ������
		//��ȡmap�����еļ�
		/*Set<String> keys = map.keySet();
		for(String key:keys){
			System.out.println(key);
		}*/
		
		//��ȡmap�����е�ֵ
		Collection<String> values = map.values();
		for(String value:values){
			System.out.println(value);
		}
		
		//�õ�key��ͬʱ�õ�key����Ӧ��ֵ
		Set<String> keys = map.keySet();
		for(String key:keys){
			System.out.println(key + "--" + map.get(key));
		}
		
		//size(�жϼ�ֵ�Եĸ���)
		System.out.println(map.size());
		
		//�ж��Ƿ�Ϊ��
		System.out.println(map.isEmpty());
		
		//map.entry���ص��� ��ӳ����������ӳ���ϵ��set��ͼ
		/**
		 * �����ǵ���put(key, value)������ʱ�����Ȼ��key
		 * ��value��װ��Entry�����̬�ڲ�������У���Entry����
		 * ����ӵ������У������������ȡmap�е����м�ֵ�ԣ�����ֻҪ��ȡ
		 * �����е�����Entry���󣬽���������Entry�����е�getKey��
		 * getValue�������ܻ�ȡ��ֵ��
		*/
		Set<Entry<String, String>> entrys = map.entrySet();
		
		for(Entry<String, String> entry:entrys){
			System.out.println(entry.getKey() + "--" + entry.getValue());
		}
		
		
		/**
		 *  hashmap����Ĭ�Ϲ��췽�������һ���ײ��ǳ���Ϊ16��Entry���飬
		 *  int hash = hash(key.hashCode());----Object������
		 *  ���ȵ���key��hashCode�������õ�һ������--��ϣ��
		 *  �ѹ�ϣ����Ϊ��������hash����������������--ɢ������--
		 *  �õ���һ������--ɢ��ֵ
		 *  int i = indexFor(hash, table, length);  ����������±�
		 *  ��ɢ��ֵ������ĳ������������㣬���յõ�Entry����Ҫ��ŵ������λ��(�±�)
		 *  
		 *  hash�ڲ��ṹ����������ṹ
		 *  ��Ϊ��ͬ��key�п������������ͬ��ɢ��ֵ������ɢ��ֵ�������ŵ�������±�
		 *  ���ͻ,
		 */
	}
}
