package SESenior.video.note.tcpsocket;

import java.io.BufferedReader;
//import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
//import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServer {
	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException {
		//1������һ��SeverSocket����
		ServerSocket severSocket = new ServerSocket(8888);
		//2������accept()�������տͻ�������
		Socket socket = severSocket.accept();
		
		System.out.println(socket.getInetAddress().getHostAddress() + " has connected");
		
		//3����ȡsocket��������������(�ֽ���ת�ַ���)
		//�ֽ�������
		BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		//�ֽ������
		/*BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));*/
		
		//��һ�ַ������û�����
		PrintWriter pw = new PrintWriter(socket.getOutputStream(), true);  //true��ʾ�Զ�ˢ��
		
		//���ͻ���д�������ַ���,
		String line = null;
		//һֱ��ȡ�ͻ���д�������ַ���(����)
		while((line=br.readLine()) != null){
			if(line.equals("over")){
				break;
			}
			System.out.println(line);
			/*//��ת���ɴ�д���ַ��������ͻ���
			bw.write(line.toUpperCase());
			bw.newLine();
			//��ջ�����
			bw.flush();*/
			
			pw.println(line.toUpperCase());
		}
		
		//�ͷ���Դ
		/*bw.close();*/
		br.close();
		socket.close();
		pw.close();
		
		System.out.println(socket.getLocalAddress().getHostName() + " has disconnected");
	}
}
