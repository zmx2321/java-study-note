package SESenior.video.note.IO;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteArrayInputoutputStreamDemo {
	public static void main(String[] args) throws IOException {
		String str = "hello,shanghai";
		
		//�ֽ������������ֽ��ж�ȡ����
		//����Դ���ֽ�����
		//�ַ���ת�ֽ�����
		ByteArrayInputStream bis = new ByteArrayInputStream(str.getBytes());
		
		int data = -1;
		
		while((data=bis.read())!=-1){
			System.out.print((char)data);
		}
		
		//����
		bis.close();
		
		
		//�ֽ����������
		//Ĭ��32�����ȵ��ֽڻ�����
		ByteArrayOutputStream bos = new ByteArrayOutputStream(100);
		//���ڲ�������д����
		bos.write(97);
		//�ַ���ת�ֽ�����
		bos.write("helloh hh".getBytes());
		
		//����һ���ֽ�����
		byte[] buff = bos.toByteArray();
		
		for(byte data1:buff){
			System.out.print((char)data1);
		}
		
		FileOutputStream fos = new FileOutputStream("D:\\_site_\\aaa\\JavaList1.txt", true);
		//��ByteArrayOutputStream�ڲ�������������д����ѽ���ļ��������
		bos.writeTo(fos);
		
		//����
		bos.close();
		
		//����ϵͳ����Դ
		fos.close();
	}
}
