/*
 * ��һ��ָ��Ŀ¼�µ�java�ļ��ľ���·�����洢��һ���ı���
 * ����һ��java���ļ��б�
 */

package SESenior.eg.fn.IO;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileDemo {
	public static void main(String[] args) {
		File dir = new File("D:\\_site_\\aaa");
		List<File> list = new ArrayList<File>();
		fileToList(dir, list);
		// System.out.println(list.size());
		File file = new File(dir, "javaList.txt");// dir��Ŀ¼
		writeToFile(list, file.toString());
	}

	// �ļ������ȷ��뼯��
	public static void fileToList(File dir, List<File> list) {
		if (dir != null) {
			if (dir.isDirectory()) {
				File[] files = dir.listFiles();  //�ļ���������
				for (File file : files) {
					fileToList(file, list);
				}
			} else {
				if (dir.getName().endsWith(".java")) {
					list.add(dir);
				}
			}
		}
	}

	// д���ı���
	public static void writeToFile(List<File> list, String javaListFile) {
		BufferedWriter bufw = null;
		try {
			bufw = new BufferedWriter(new FileWriter(javaListFile));
			for (File f : list) {
				String path = f.getAbsolutePath();
				bufw.write(path);
				bufw.newLine();
				bufw.flush();
			}

		} catch (IOException e) {
			throw new RuntimeException(e.getMessage());
		} finally {
			try {
				if (bufw != null) {
					bufw.close();
				}
			} catch (IOException e) {
				throw new RuntimeException(e.getMessage());
			}
		}
	}
}
