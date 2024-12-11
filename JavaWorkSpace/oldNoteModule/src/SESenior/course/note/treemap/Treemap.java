package SESenior.course.note.treemap;

import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

/**
 * treemap
 * ����
 */

public class Treemap {
	public static void main(String[] args) {
		//ʵ����
		TreeMap<String, String> map = new TreeMap<String, String>();
		
		//�������
		map.put("a", "132");
		map.put("b", "456");
		map.put("12", "www");
		
		//����
		Set<Entry<String, String>> set = map.entrySet();
		
		for(Entry<String, String> entry : set) {
			System.out.println(entry.getKey() + "--" + entry.getValue());;
		}
		
	}
}
