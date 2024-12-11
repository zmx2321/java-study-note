/* 
 * ��ȡһ��Ŀ¼�µ������ļ��к��ļ����������ļ��к����ļ� �� 
 * �����ļ��к��ļ����ƴ�ӡ�ڿ���̨���档����Ҫ��ʾ�ļ�Ŀ¼�Ĳ㼶 
 * ע�������˵ݹ���㷨�� 
 */

package SESenior.eg.fn.FileDemo;

import java.io.File;

public class FileDemo1 {
	public static void main(String[] args) {
		File dir = new File("D:\\_site_\\aa\\");
		// File dir=new File("F:\\");
		// ���ʹ���������̷��ĸ�Ŀ¼�������java.lang.NullPointerException
		// Ϊʲô��
		getAllFiles(dir, 0);// 0��ʾ���
	}

	// ��ȡ�㼶�ķ���
	public static String getLevel(int level) {
		// A mutable sequence of characters.
		StringBuilder sb = new StringBuilder();
		for (int l = 0; l < level; l++) {
			sb.append("|--");
		}
		return sb.toString();
	}

	public static void getAllFiles(File dir, int level) {
		System.out.println(getLevel(level) + dir.getName());
		level++;
		File[] files = dir.listFiles();
		for (int i = 0; i < files.length; i++) {
			if (files[i].isDirectory()) {
				// ���������˵ݹ���㷨
				getAllFiles(files[i], level);
			} else {
				System.out.println(getLevel(level) + files[i]);
			}
		}
	}
}
