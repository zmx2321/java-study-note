/*
 *  �ݹ�ʵ��ɾ���ļ���Ŀ¼�� ���������
 */

package SESenior.eg.fn.FileDemo;

import java.io.File;

class RecursionDeleteFileDemo {  // ���õݹ� ɾ�� �ļ���Ŀ¼ ����
	public static void deleteFiles(File file) {
		// �ݹ����
		// �ж�Ŀǰ�ļ���������ļ� �� ��һ���յ��ļ��У���ɾ��
		if (file.isFile() || file.list().length == 0) {
			file.delete();
		} else {
			File[] files = file.listFiles();
			for (File f : files) {
				// �ݹ����
				deleteFiles(f);
				f.delete();
			}
		}
	}
}

public class FileDemo2 {
	public static void main(String[] args) {
		File file = new File("D:/_site_/aaa/aa");
		RecursionDeleteFileDemo.deleteFiles(file);
		System.out.println("ɾ���ɹ���");
	}
}
