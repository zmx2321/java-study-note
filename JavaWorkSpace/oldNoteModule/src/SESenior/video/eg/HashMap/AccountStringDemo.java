package SESenior.video.eg.HashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class AccountStringDemo {
	public static void main(String[] args) {
		String[] strs = {"aa", "aa", "bb", "cc"};
		
		AccountUtil.printData(AccountUtil.account(strs));
	}
}

class AccountUtil{
	//ֻΪ�ⲿ������þ�̬��
	public static Map<String, Integer> account(String[] strs){
		//����һ������
		Map<String, Integer> data = new HashMap<String, Integer>();
		
		//ѭ��
		for(int i=0; i<strs.length; i++){
			String str = strs[i];
			if(data.get(str)==null){
				data.put(str, 1);
			}else{
				//ȡ��key����Ӧ��ֵ��1
				data.put(str, data.get(str) + 1);
			}
		}
		return data;
	} 
	
	public static void printData(Map<String, Integer> data){
		Set<Entry<String, Integer>> entrys = data.entrySet();
		
		for(Entry<String, Integer> entry:entrys){
			System.out.println(entry.getKey() + "���ֵĴ���Ϊ" + entry.getValue());
		}
	}
}