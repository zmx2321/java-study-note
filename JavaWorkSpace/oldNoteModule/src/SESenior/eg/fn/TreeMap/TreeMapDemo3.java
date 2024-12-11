/*
 *  ��asdascveasrgdfsdf����ȡ���ַ����У�ÿһ����ĸ���ֵĴ�����
 *  Ҫ�󣺴�ӡ����ǣ�a(2)b(1)... 
 */

package SESenior.eg.fn.TreeMap;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapDemo3 {
	public static void main(String[] args) {
		String str = "asdascveasrgdfsdf";  
        str = getCharCount(str);  
        System.out.println(str);
	}
	
	public static String getCharCount(String s) {  
		TreeMap<Character, Integer> tmap = new TreeMap<>();  
        //���ַ�������ַ�����  
        char[] chs=s.toCharArray();  
        //�������飬�������е�ÿһ��Ԫ��ȡ��  
        for (int i = 0; i < chs.length; i++) {  
            if(chs[i]<'a'||chs[i]>'z')  
                continue;  
            //�ж�ȡ����Ԫ����Ϊ�����Ƿ���map������  
            Integer value=tmap.get(chs[i]);  
            if(value==null){  
            	tmap.put(chs[i], 1);  
            }  
            else{  
            	tmap.put(chs[i],value+1);  
            }     
              
              
        }  
        return myString(tmap);  
    }  
  
    private static String myString(Map<Character, Integer> mp) {  
        //��stringbuilder����  
        StringBuilder sb=new StringBuilder();  
        Iterator<Map.Entry<Character,Integer>> it=mp.entrySet().iterator();  
        while(it.hasNext()){  
            Map.Entry<Character,Integer> me=it.next();  
            Character key=me.getKey();  
            Integer value=me.getValue();  
            sb.append(key+"("+value+")"+" ");  
        }  
          
        return sb.toString();  
    }  
}
