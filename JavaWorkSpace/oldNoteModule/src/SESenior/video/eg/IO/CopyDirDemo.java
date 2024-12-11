package SESenior.video.eg.IO;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyDirDemo {
	public static void main(String[] args) {
		try {
			CopyDirUtil.copyDir(new File("D:\\_site_\\aaa"), new File("D:\\_site_\\aac"));
			System.out.println("success!");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

class CopyDirUtil{
	public static void copyDir(File src, File dst) throws IOException{
		//dst.mkdir();����s��D:\_site_\aaaû��_site_�ļ��У����޷�����
		dst.mkdirs();  //����Ŀ���ļ���
		//���Դ�ļ��в�Ϊ��
		if(src!=null){
			//����Դ�ļ��������е�����(�ļ���Ŀ¼)
			File[] files = src.listFiles();
			//
			if(files!=null){
				//�������ļ�
				for(File f:files){
					if(f.isFile()){
						//�����ļ�(���ֽ���)
						FileInputStream fis = new FileInputStream(f);
						//���Ƶ�
						FileOutputStream fos = new FileOutputStream(dst.getAbsolutePath() + "\\" + f.getName());
						
						//Ϊ������Ч�ʣ�����һ������������
						//�Զ���һ��1M���ֽڻ�����
						byte[] buff = new byte[1024*1024];
						
						int len = 0;  //�������ֽڸ���
						
						//�����ֽڻ������У���ֵ��len,��-1˵�����ļ�ĩβ
						while((len=fis.read(buff))!=-1){
							fos.write(buff, 0, len);
						}
						
						//�ͷ���Դ
						fis.close();
						fos.close();
					}else{
						//���費���ļ����ݹ�
						copyDir(f, new File(dst.getAbsolutePath()+ "\\" + f.getName()));
					}
				}
			}
		}
	}
}
