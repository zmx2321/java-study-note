package SESenior.video.eg.MutiCopyFileDemo;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public class MutiCopyFileDemo {
	public static void main(String[] args) {
		MutiCopyFileUtil copyFileUtil = new MutiCopyFileUtil("D:\\_site_\\aaa\\aa.mp3", "D:\\_site_\\aac\\cc.mp3", 3);
		
		copyFileUtil.copyFile();
	}
}

class MutiCopyFileUtil{
	private String src;  //Դ�ļ�
	private String dst;  //Ŀ���ļ�
	private int threadSize;  //��������߳�ȥ����Դ�ļ�
	
	//���췽��
	public MutiCopyFileUtil(String src, String dst, int threadSize) {
		super();
		this.src = src;
		this.dst = dst;
		this.threadSize = threadSize;
	}
	
	//�����ļ��ķ���
	public void copyFile(){
		File file = new File(src);  //Դ�ļ���File����
		long fsize = file.length();  //�õ�Ҫ��ֵ�ļ��Ĵ�С(�ֽ���)
		
		//ÿ���߳����ص��ļ���Ĵ�С(�ֽ���)
		long block = fsize%threadSize==0 ? fsize/threadSize : fsize/threadSize+1;
		
		for(int threadId=0; threadId<threadSize; threadId++){
			//��������߳��������ļ��ĸ��ƣ�ÿ���̶߳��Ḵ��һ������
			new DownLoadThread(fsize, block, threadId).start();
		}
	}
	
	//��Ա�ڲ���(�߳���)
	private class DownLoadThread extends Thread{
		private long fsize;  //�ļ���С
		private long block;  //ÿ���߳�Ҫ���ص��ֽ�����С
		private int threadId;  //�߳�Id�ţ���0��ʼ
		private int bufSize = 1024*1024;  //��������С(1M)
		
		//���췽��
		public DownLoadThread(long fsize, long block, int threadId) {
			super();
			this.fsize = fsize;
			this.block = block;
			this.threadId = threadId;
		}
		
		//�̲߳���
		@Override
		public void run() {
			try {
				//ÿ���̶߳�Ҫ��Դ�ļ�
				RandomAccessFile reader = new RandomAccessFile(src, "r");  //ֻ��
				//ÿ���̶߳�Ҫд��Ŀ���ļ�
				RandomAccessFile writer = new RandomAccessFile(dst, "rw");  //��д
				//ÿ���߳����ص���ʼλ��
				long startPosition = threadId*block;
				//ÿ���߳����صĽ���λ��
				long endPosition = startPosition+block>fsize ? fsize : startPosition+block;
				//ÿ���̶߳�ָ��Դ�ļ�����Ӧ����ʼ���ص�λ��(�ļ�ָ��)
				reader.seek(startPosition);
				//ÿ���̶߳�ָ��Ŀ���ļ�����Ӧ����ʼд���λ��(�ļ�ָ��)
				writer.seek(startPosition);
				//������
				byte[] buff = new byte[bufSize];
				
				//����
				while(startPosition<endPosition){
					int len = 0;  //������ʵ�ʳ���
					if(startPosition+bufSize<endPosition){
						len = reader.read(buff);  //����������
					}else{
						//��ʣ������������������д�뵽��������
						len = reader.read(buff, 0, (int)(endPosition-startPosition));
					}
					startPosition += len;  //��ʼλ�ö�һ�ξͷ����仯
					writer.write(buff, 0, len);  //�ѻ������е�����д��ָ���ļ���ָ������
					
					System.out.println("�̣߳�" + (threadId+1) + "����" + len + "�ֽ�");
				}
				
				//�ͷ���Դ
				reader.close();
				writer.close();
				System.out.println("�̣߳�" + (threadId+1) + "�������");
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}

