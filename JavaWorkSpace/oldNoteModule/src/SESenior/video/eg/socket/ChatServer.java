package SESenior.video.eg.socket;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class ChatServer {
	@SuppressWarnings({ "resource" })
	public static void main(String[] args) throws IOException {
		//���տͻ�������������socket����
		ServerSocket severSocket = new ServerSocket(8888);
		
		//����ͻ��˵ĸ���
		int number = 1;
		
		while(true){
			//���տͻ��˴����������󣬷��ص���socket����
			Socket socket = severSocket.accept();
			
			System.out.println("�ͻ���" + number + "���ӳɹ���");
			
			//�����̶߳Կͻ��˽��ж�д����
			//����˿���һ���������̶߳Կͻ��˽��ж�д����
			new Thread(new ServerStream(socket, number)).start();
			
			number++;
		}
		
		
	}
}
