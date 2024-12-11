package SESenior.video.eg.socket;

import java.io.IOException;
import java.net.Socket;

public class ChatClient {
	public static void main(String[] args) throws IOException {
		Socket socket = new Socket("127.0.0.1", 8888);
		
		//������д
		//����2���߳�
		new Thread(new ClientInputStream(socket)).start();  //������
		new Thread(new ClientOutputString(socket)).start();  //�����
	}
}
