package SESenior.video.note.otherio;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class InputStreamWriterReaderDemo {
	public static void main(String[] args) throws IOException{
		//д��
		OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("D:\\_site_\\aaa\\io1.txt"), "utf-8");
		
		//��װ���ӻ�����
		BufferedWriter bw = new BufferedWriter(osw);
		
		bw.write("���");
		
		bw.close();
		
		//��(gb2312.���벻��)
		//BufferedReader br = new BufferedReader(new FileReader("D:\\_site_\\aaa\\io1.txt"));
		BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("D:\\_site_\\aaa\\io1.txt"), "utf-8"));
		
		String line = null;
		
		//һ���ж�����ȡһ�У���ֵ���ַ�������
		while((line=br.readLine())!=null){
			System.out.println(line);
		}
		
		br.close();
	}
}