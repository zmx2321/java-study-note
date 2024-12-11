package SESenior.video.note.IO;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedInputStreamOutStreamDemo {
	public static void main(String[] args) {
		try {
			FileUtil.copy(new File("D:/_site_/aaa/JavaList.txt"), new File("D:/_site_/aab/JavaList1.txt"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

class FileUtil{
	public static void copy(File src, File dst) throws IOException{
		//�����ļ�����������ȡ�ļ��е����ݣ�
		FileInputStream fis = new FileInputStream(src);
		//�����ļ��������д���ļ��е����ݣ�
		FileOutputStream fos = new FileOutputStream(dst);
		
		//��װ��
		//���췽�������ֽ������������ӻ������Ĺ���
		BufferedInputStream bis = new BufferedInputStream(fis);
		//���췽�������ֽ�����������ӻ������Ĺ���(�ֽ�����)
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		
		int data = 0;
		
		//��ú�����
		Long t1 = System.currentTimeMillis();
		
		//readֱ�Ӵӻ�������
		while((data=bis.read())!=-1){
			bos.write(data);
		}
		
		bis.close();
		bos.close();
		
		//��ú�����
		Long t2 = System.currentTimeMillis();
				
		System.out.println("������ɣ�������" + (t2-t1) + "����");
	}
}