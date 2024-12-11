package SESenior.course.note.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/*
	1.Java���ֽ���
	   InputStream�������ֽ������������ȣ���OutputStream�������ֽ�����������ȡ�
	2.Java���ַ���
	   Reader�����ж�ȡ�ַ��������������ȣ���writer����������ַ��������ȡ�
	InputStream��OutputStream,Reader,writer���ǳ����ࡣ���Բ���ֱ��new 
 */

/**
 * �ֽ���(��������������ã������������ַ���)
 */

public class Class1 {
	public static void main(String[] args) throws IOException {
		File file1 = new File("D:\\1_java\\aa.txt");
		File file2 = new File("D:\\1_java\\bb.txt");
		//InputStream�ǳ����࣬������������ʵ����
		//��ȡfile�ļ�
		InputStream ins = new FileInputStream(file1);
		
		//�����
		OutputStream ous = new FileOutputStream(file2);
		// ��ȡ�ֽ���
		// byte -- 8λ[00000000-11111111][0-255]
//		int value = ins.read();  //����һ������
		
		//û���ַ�����-1
		/*System.out.println(ins.read());
		System.out.println(ins.read());
		System.out.println(ins.read());
		System.out.println(ins.read());*/
		//int content = 0;
		//һλһλ�ض�����,Ч�ʵͣ�����������
		//һ�ζ�1024���ֽ�
		byte[] buff = new byte[1024];
		
		/*while((content = ins.read()) != -1){
			//�ļ�δ����
			System.out.println("=" + content);
		}*/
		
		int len = 0;
		while((len = ins.read(buff)) != -1){
			//[97��,9,99��x,x,��1024]
			System.out.println(len);
			//�ֽ����飬���������ݵ���Ч����
			ous.write(buff, 0, len);
		}
		
		//������Ҫ�ر�,�����淶
		ins.close();
		ous.close();
	}
}
