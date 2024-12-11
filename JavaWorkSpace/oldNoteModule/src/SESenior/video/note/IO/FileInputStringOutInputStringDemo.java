package SESenior.video.note.IO;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputStringOutInputStringDemo {
	public static void main(String[] args) {
		try {
			FileCopyUtil.copy(new File("D:/_site_/aaa/JavaList.txt"), new File("D:/_site_/aab/JavaList1.txt"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

class FileCopyUtil{
	//����һ���ļ�����һ��Ŀ¼��(Դ��Ŀ��)
	//�������쳣���õ��������������ȥ����
	public static void copy(File src, File dst) throws IOException{
		//�����ļ�����������ȡ�ļ��е����ݣ�
		FileInputStream fis = new FileInputStream(src);
		//�����ļ��������д���ļ��е����ݣ�
		FileOutputStream fos = new FileOutputStream(dst);
		
		//��ú�����
		Long t1 = System.currentTimeMillis();
		
		/*��һ�ַ���*/
		/*int data = -1;
		
		//���������ж�ȡ
		while(fis.read()!=-1){
			fos.write(data);
		}*/
		
		/*�ڶ��ַ���*/
		//�ȷŵ�������
		//����һ��1M��С�Ļ���������������������е��ֽ�
		byte[] buf = new byte[1024*1024];
		
		int len = 0;  //����ʵ�ʶ������ֽ���
		
		while((len=fis.read(buf))!=-1){  //˵��û�ж����ļ�ĩβ
			//���ֽ������ж���������д����Ӧ�������
			fos.write(buf, 0, len);
		}
		
		//�ͷ���Դ
		fis.close();
		fos.close();
		
		//��ú�����
		Long t2 = System.currentTimeMillis();
		
		System.out.println("������ɣ�������" + (t2-t1) + "����");
	}
}