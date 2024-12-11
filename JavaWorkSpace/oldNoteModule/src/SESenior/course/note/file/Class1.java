package SESenior.course.note.file;

import java.io.File;
import java.util.Date;

/**
 * file��
 *
 */

public class Class1 {
	public static void main(String[] args) {
		File file = null;  //����
		
		//����Ŀ¼
		//һ��\���У�һ����ʾת��
		//file = new File("D:\\1_java");
		
		//��ͬ����ϵͳ���ָ�����һ��
		//linux  /
		//��ȡ��ǰ����ϵͳ�ָ���(separator�Ǿ�̬����)
		String path = "D:" + File.separator + "1_java";
		String filepath = "D:" + File.separator + "1_java" + File.separator + "Tset1.java";
		String testpath = "D:\\testio8";
		
		System.out.println(path);
		file = new File(path);
		
		//.��ʾ��ǰ��  ..��ʾ�ϼ�
		File file2 = new File("./Class.java");
		
		//
		File file3 = new File(filepath);
		
		File file4 = new File(testpath);  //����������
		
		//����file����
		
		//�ж�·�����ļ����Ƿ����
		System.out.println(file.exists());
		
		//��ȡ����·��
		System.out.println(file.getAbsolutePath());
		System.out.println(file2.getAbsolutePath());
		
		//���·��
		System.out.println(file.getPath());
		System.out.println(file2.getPath());
		
		//������һ��·��
		System.out.println(file.getParent());
		
		//��ȡ�ļ�����
		System.out.println(file.getName());
		
		//�޸�ʱ��....ʱ���ת��
		System.out.println(new Date(file.lastModified()));
		System.out.println(new Date(file3.lastModified()));
		
		//��С(�ֽ�)���ļ���С��
		System.out.println(file3.length());
		
		//������
		System.out.println(file3.renameTo(new File("D:" + File.separator + "1_java" + File.separator + "Tset5.java")));
		
		System.out.println(file4.renameTo(new File("D:\\testio8")));
		
		//������+�ƶ�(����)
		System.out.println(file4.renameTo(new File("D:\\1_java\\testio4")));
		
		File file5 = new File("D:\\1_java\\testio4\\aaa");
		
		//ɾ�����ļ��л��ļ�
		System.out.println(file5.delete());
		
		//��ȡ�ļ����������ļ�
		File[] files = file.listFiles();
		for(File f : files){
			if(f.isFile()){  //������ļ�
				System.out.println("�ļ�����" + f.getName());
			}else{
				System.out.println("�ļ�������" + f.getName());
			}
		}
		
		//�����ļ���
		File dirFile = new File("D:\\1_java\\aa\\ww\\vvv");
		dirFile.mkdirs();  //�����༶Ŀ¼
		dirFile.mkdir();  //����һ��Ŀ¼��Ҫ��֤��Ŀ¼����
	}
}
