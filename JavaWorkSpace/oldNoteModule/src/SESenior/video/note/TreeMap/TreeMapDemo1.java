package SESenior.video.note.TreeMap;

import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapDemo1 {
	public static void main(String[] args) {
		TreeMap<String, String> tmap = new TreeMap<>();
		//Ĭ�ϰ�װ������Ȼ˳����������
		tmap.put("jack", "zhangsan");
		tmap.put("marry", "xiaohong");
		tmap.put("rock", "xiaozhang");
		tmap.put("free", "xiaoming");
		tmap.put("rock", "cmcc");  //�ظ��ᱻ�滻
		
		System.out.println(tmap);
		
		//�����
		Set<Entry<String, String>> entrys = tmap.entrySet();
		
		//����
		for(Entry<String, String> entry:entrys){
			System.out.println(entry.getKey() + "--" + entry.getValue());
		}
	}
}
