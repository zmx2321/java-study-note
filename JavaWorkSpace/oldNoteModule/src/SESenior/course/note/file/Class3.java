package SESenior.course.note.file;

import java.io.File;
import java.util.LinkedList;

/**
 * �ļ�����
 */

public class Class3 {
	public static void main(String[] args) {
		//Class3.demo1(new File("D:" + File.separator + "_soft_"));
		
		File file = new File("D:" + File.separator + "1_java");
		demo1(file);
		System.out.println("===============");
		demo2(file);
	}
	
	/**
	 *	�ݹ���� 
	 */
	public static void demo2(File file){
		//��ȡ��ǰfile����
		File[] files = file.listFiles();
		//������������
		if(files == null || files.length ==0){  //�ļ�����Ϊ��
			//�ݹ鷵��
			return;
		}
		//ѭ������files
		for(File f : files){
			//�ж����ļ������ļ���
			if(f.isDirectory()){  //�ļ���
				//���õݹ飬��������
				demo2(f);
			} else {  //�ļ�
				//��ӡ���
				System.out.println("�ļ�����" + f.getName());
			}
		}
	}
	
	/**
	 * �ǵݹ����
	 */
	public static void demo1(File file){
		LinkedList<File> fileList = new LinkedList<>();
		
		//��ȡ��ǰfile����
		File[] files = file.listFiles();
		//����
		for(File f : files){
			//�ж����ļ������ļ���
			if(f.isDirectory()){  //�ļ���
				//����������������ȷ������ʲô�����棨���黹�Ǽ��ϣ�
				fileList.add(f);
				
			} else {  //�ļ�
				//��ӡ���
				System.out.println("�ļ�����" + f.getName());
			}
		}
		
		//��ǰ�ļ����µ�·�����ļ��������
		//������������������ļ������滹���ļ���
		
		//���������е��ļ���
		while(!fileList.isEmpty()){  //�����Ƿ�Ϊ�գ������Ϊ�գ�
			File tmpFile = fileList.removeFirst();  //��ȡ���ϵ�һ��Ԫ�ز�ɾ��
			// ��ȡ�ļ����µ���������
			File[] tmpFiles = tmpFile.listFiles();
			//����File[]
			for(File f : tmpFiles){
				//�ж����ļ������ļ���
				if(f.isDirectory()){  //�ļ���
					//����������������ȷ������ʲô�����棨���黹�Ǽ��ϣ�
					fileList.add(f);
					
				} else {  //�ļ�
					//��ӡ���
					System.out.println("�ļ�����" + f.getName());
				}
			}
		}
	}
}
