package SESenior.course.note.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * IO��file��
 */

public class Class2 {
	/**
	 * test
	 * @param args
	 */
	public static void main(String[] args) {
		
	}
	
	public  static void test1() throws IOException{
		File file = new File("d:/123/abc.txt");
		
		file.createNewFile();  //�����ļ�
		
		file.listFiles();
	}
	
	public static void test2(){
		//�ֽ���
		//����һ���ļ�������λ��
		File file = new File("d:/123/bb.txt");
		
		//����һ����������ȡ����ļ�
		InputStream fis = null;
		
		//���(����)��ָ��·��
		OutputStream fos = null;
		
		try{
			
			fis = new FileInputStream(file);
			
			fos = new FileOutputStream(new File("d:/123/dd.txt"));
			
			//��
			
			//���建����
			byte[] buff = new byte[024*1024];  //�ֽ�����
			int len = 0; //fis.read(buff);  //���ص�ǰ���˶���
			
			//����-1������������-1������
			while((len = fis.read(buff)) != -1){  //����buff����
				//����
				fos.write(buff, 0, len);  //��buff�����е�����д��������
			}
		}catch(IOException e){
			System.out.println(e.getMessage());
		}finally{
			//�ر���
			if(fis != null){
				try {
					fis.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
			if(fos != null){
				try {
					fos.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
}
