package SESenior.video.note.tcpsocket;

import java.io.BufferedReader;
//import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
//import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;

public class TCPClient {
	public static void main(String[] args) throws IOException {
		Socket socket = new Socket("127.0.0.1", 8888);
		//��ȡ����������(�û�����)
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//�������ͨ��socket�����socket�׽��ֶ��󣬻���ֽ������(�û�����)
		/*BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));*/
		//��ȡ��������������
		BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		
		//��һ�ַ������û�����
		PrintWriter pw = new PrintWriter(socket.getOutputStream(), true);  //true��ʾ�Զ�ˢ��
		
		//��ѭ�������Բ��ϵ������˷����ַ���
		while(true){
			String line = br.readLine();  //��ȡ������������ַ���
			//д
			/*bw.write(line);
			bw.newLine();  // ����
			bw.flush();*/
			pw.println(line);
			if(line.equals("over")){
				break;
			}
			//��ȡ����˵Ĵ�д�ַ���
			System.out.println(reader.readLine());
		}
		
		//�ͷ���Դ
		reader.close();
		br.close();
		/*bw.close();*/
		pw.close();
		socket.close();
	}
}
