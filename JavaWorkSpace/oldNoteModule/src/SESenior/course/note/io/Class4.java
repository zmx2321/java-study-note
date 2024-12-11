package SESenior.course.note.io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;

/**
 * 
 * ת����
 *
 */

public class Class4 {
	public static void main(String[] args) throws IOException {
		demo1();
		
//		demo2();
	}

	// �ֽ�������ַ���
	public static void demo1() throws IOException{
		//�ֽ���
		FileInputStream fis = new FileInputStream(new File("D://123//aa.txt"));
		FileOutputStream fos = new FileOutputStream(new File("D://123//bb.txt"));
		//������һ��InputStream������һ������ָ�������ʽ��utf8��gbk��unicode��iso8859-1...��
		// �ֽ�������ַ���
		//��д���б���
		//(�ַ���)
		//�����ֽ��� --> �����ַ���
		Reader fid = new InputStreamReader(fis, "gbk");
		//����ֽ��� --> ����ַ���
		Writer fiw = new OutputStreamWriter(fos, "iso8859-1");  //��д���벻һ�µ�������
		
		System.out.println("*********IO���������������ͬ********");
		
		char[] buff = new char[1024*1024];
		
		int len = 0;
		while((len=fid.read(buff))!=-1){
			// ����һ���ַ�������ȡ�ַ��������Ч����
			System.out.println(new String(buff, 0, len));
			fiw.write(buff, 0, len);
		}
		
		System.out.println("*********IO���������������ͬ********");
		
		fiw.close();
		fid.close();
	}
	
	//��ѧ����
	public static void demo2() throws IOException{
		//������(�ֽڻ��������ַ�������)-->���ļ���ȡ�����Ч�ʣ�����Ϸ��G����ѹ��
		//�Ӵ��̻��������ж�ȡ{�������ж�ȡ��д�����̣����أ�}
		//�ڴ棨ͼƬ�����ڴ棬��ˮӡ��
		//�漰������ת����
		//���Լ��أ�Properties �����ļ�����
		//PrintSreeam��ӡ����javaweb servlet��(�ֽڣ��ַ�)
		//file����չRandomAccessFile(�ļ��и�ͺϲ�)����վ�ϴ���
		//�������л�Serializable��java�ڴ��еĶ��󣬱��浽���ش����ϣ�
		//�ڴ�  --> ByteArrayInputStream, ByteArrayOutputStream
		//�ֽڻ�����
		String path1 = "D://123//aa.txt",
			   path2 = "D://123//bb.txt";
		
		File file1 = new File(path1);
		File file2 = new File(path2);
		
		//�����ļ��������������ȡд���ļ��е����ݣ�
		InputStream fis = new FileInputStream(file1);
		OutputStream fos = new FileOutputStream(file2);
		
		//��װ��
		//���췽�������ֽ���������������ӻ������Ĺ���
		BufferedInputStream bis = new BufferedInputStream(fis);
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		
		/**/
		int data = 0;
		//readֱ�Ӵӻ�������
		while((data=bis.read())!=-1){
			bos.write(data);
		}
		
		//�ر���
		bis.close();
		bos.close();
	}
}
