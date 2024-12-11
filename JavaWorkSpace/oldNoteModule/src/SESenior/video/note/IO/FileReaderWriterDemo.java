package SESenior.video.note.IO;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderWriterDemo {
	public static void main(String[] args) throws IOException {
		//�ַ�������
		FileReader fr = new FileReader("D:\\_site_\\aaa\\JavaList.txt");
		//�ַ������
		FileWriter fw = new FileWriter("D:\\_site_\\aac\\Java879.txt");
		
		//����������(�ַ�����)
		char[] buff = new char[100];
		
		int len = 0;  //ʵ�ʶ������ַ�����
		
		//����ĩβ
		while((len=fr.read(buff))!=-1){
			//����
			fw.write(buff, 0, len);
			fw.flush();  //ǿ����ջ��������ѻ������е�����ǿ��д�������
		}
		
		//�ͷ���Դ
		fr.close();
		fw.close();  //���ر��޷����ƣ�������û������Ҳ�����flush
	}
}
