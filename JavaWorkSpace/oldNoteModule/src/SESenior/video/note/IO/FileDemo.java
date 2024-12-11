package SESenior.video.note.IO;

import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;
import java.io.IOException;

public class FileDemo {
	public static void main(String[] args) {
		//����ĳ��·��
		File file = new File("D:\\_site_\\aaa");
		
		//��ø�Ŀ¼�ľ���·��
		System.out.println(file.getAbsolutePath());
		
		//�����һ��Ŀ¼���ַ���
		System.out.println(file.getParent());
		
		//�ж��Ƿ����ļ��л���Ŀ¼
		System.out.println(file.isDirectory());
		
		//�ж��Ƿ����ļ�
		System.out.println(file.isFile());
		
		//�ж�Ŀ¼�Ƿ����
		System.out.println(file.exists());
		
		//Ŀ¼��С
		System.out.println(file.length());
		
		//�鿴�Ƿ���ɾ��,��ɾ������(ֻ��ɾ����Ŀ¼)
		System.out.println(file.delete());
		
		//����Ŀ¼(�ļ���)
		File myFile = new File("D:\\_site_\\aaa");
		System.out.println(myFile.mkdirs());
		
		//�����ļ�
		File myFile2 = new File("D:/_site_/aaa/ca.txt");
		try {
			System.out.println(myFile2.createNewFile());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//�鿴�ļ��������ļ�����Ŀ¼��
		String[] files = file.list();
		for(String i:files){
			System.out.println(i);
		}
		
		//������Ҫ���ļ���Ŀ¼(�����ڲ���)
		//�����ӿڵ�ʵ�������
		//�������������ռ�����Ӧ��������
		String[] files1 = file.list(new FilenameFilter() {
			@Override
			public boolean accept(File dir, String name) {
				//Ҫ���������
				//��.txt��β���ļ�
				return name.endsWith(".txt");
			}
		});
		for(String i1:files1){
			System.out.println(i1);
		}
		
		//��ָ����Ŀ¼ȥ���ң�����һ���ļ�����
		//�ļ���Ŀ¼�Ĵ�С(�ֽ�)
		File[] files2 = file.listFiles();
		for(File i2:files2){
			System.out.println(i2.getName() + "--" + i2.length());
		}
		
		File[] files3 = file.listFiles(new FilenameFilter() {
			@Override
			public boolean accept(File dir, String name) {
				return name.endsWith(".txt");
			}
		});
		for(File i3:files3){
			System.out.println(i3.getName() + "--" + i3.length());
		}
		
		//�ӿڵ�ʵ����
		File[] files4 = file.listFiles(new FileFilter() {
			@Override
			public boolean accept(File pathname) {
				return pathname.getName().endsWith(".txt");
			}
		});
		for(File i4:files4){
			System.out.println(i4.getName() + "--" + i4.length());
		}
	}
}
