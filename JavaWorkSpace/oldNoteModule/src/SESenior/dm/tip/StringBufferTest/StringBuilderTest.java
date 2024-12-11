/*
 *  ���ַ�����ʽ�Ӽ������룬�ú��ִ�д��ʽ��ʾһ������,��������������б���(�Զ����쳣)��
 *  ������洢����ΪnewStrBuf��StringBuilder�Ķ��󲢴�ӡ����
 */

package SESenior.dm.tip.StringBufferTest;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringBuilderTest {
	//������̬����
	private final static String[] STR_strBER = { "��", "Ҽ", "��", "��", "��", "��", "½", "��", "��", "��" };
	
	//�������ж�ĳ�ַ����Ƿ�Ϊ����
	public static boolean isstreric(String str){ 
	   Pattern pattern = Pattern.compile("[0-9]*"); 
	   Matcher isstr = pattern.matcher(str);
	   if(!isstr.matches() ){
	       return false; 
	   } 
	   return true; 
	}
	
	//���ַ���ת���ɴ�д����
	public static String toUppercaseChineseCharacters(String str) throws Exception{
		if(StringBuilderTest.isstreric(str)){
			//���ַ���Ϊ����ʱ����ת��
			StringBuilder temp = new StringBuilder();  //����һ���ַ�������
			
			for (int i = 0; i < str.length(); i++) {
				temp.append(STR_strBER[str.charAt(i) - 48]);  //str.charAt(i)-48��ȡ��ֵ
			}
			
			str = temp.toString();  //���ַ��������е�ֵ����str
		}else{
			//���ַ�����Ϊ����ʱ������(�Զ����쳣)������ֹ����
			throw new Exception("input error!");
		}
		
		return str;
	}
	
	//������
	public static void main(String[] args) /*throws Exception*/ {
		String str = "";  //����һ�����ַ���
		System.out.print("������һ�����֣�");
		
		Scanner in = new Scanner(System.in);  //��ȡ����
		str = in.next();  //���û�����
		in.close();  //�رռ���
		
		try {
			System.out.println(StringBuilderTest.toUppercaseChineseCharacters(str));
		} catch (Exception e) {
			System.out.println("error��" + e.getMessage());
		}finally{
			//�������
			System.exit(0);
		}
	}
}
