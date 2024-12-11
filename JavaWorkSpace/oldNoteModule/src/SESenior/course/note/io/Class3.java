package SESenior.course.note.io;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

/**
 * 
 * �ַ���
 *
 */

public class Class3 {
	public static void main(String[] args) throws IOException {
		demo1();
	}
	
	// reader��writer
	public static void demo1() throws IOException{
		String path1 = "D://123//aa.txt",
			   path2 = "D://123//bb.txt";
			
			File file1 = new File(path1);
			File file2 = new File(path2);
			
			// char  byte
			//������
			Reader fid = null;  //��
			Writer fiw = null;  //д
			
			fid = new FileReader(file1);
			fiw = new FileWriter(file2, true);  //�Ƿ�׷��
			//false��ʾ������֮ǰ��ʲô���ݣ������¿�ʼд(�����д)
			
			System.out.println("*********IO���������������ͬ********");
			
			char[] buff = new char[1024*1024];
			
			int len = 0;
			while((len=fid.read(buff))!=-1){
				// ����һ���ַ�������ȡ�ַ��������Ч����
				System.out.println(new String(buff, 0, len));
				fiw.write(buff, 0, len);
			}
			
			//����flush����
			fiw.write("����flush����");
			fiw.write("���Ի��� \r\n abc");
			fiw.flush();  //�����ڹر�֮ǰҲ��ˢ��
			//ˢ�»����������������е���������ˢ��Ŀ���ļ���
			
			System.out.println("*********IO���������������ͬ********");
			
			fiw.close();
			fid.close();
	}
}
