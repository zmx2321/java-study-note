package SESenior.video.eg.socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.net.SocketException;

public class ClientInputStream implements Runnable {
	private Socket socket = null;
	
	
	public ClientInputStream(Socket socket) {
		super();
		this.socket = socket;
	}

	@Override
	public void run() {
		try {
			//��ȡ����˴������Ĵ�д�ַ���
			//socket.getInputStream()��ö�Ӧ��������
			BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			
			while(true){
				try {
					//��ȡ
					String line = br.readLine();
					System.out.println(line);
				} catch (SocketException e) {
					break;
				}
			}
			br.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
