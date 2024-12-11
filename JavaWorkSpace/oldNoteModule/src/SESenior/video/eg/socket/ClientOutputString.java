package SESenior.video.eg.socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class ClientOutputString implements Runnable {
	//ͨ��socket�����ö�Ӧ�����������
	private Socket socket = null;  //����һ��socket�����ñ���
	
	//���췽��
	public ClientOutputString(Socket socket) {
		super();
		this.socket = socket;
	}

	@Override
	public void run() {
		try {
			//���̱�׼������
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
			//ͨ��socket����д��
			PrintWriter pw = new PrintWriter(socket.getOutputStream(), true);
				
			//��ü������������
			while(true){
				//��ü����������һ���ַ���
				String line = br.readLine();
				pw.println(line);
				if(line.equals(" bye")){
					break;
				}
			}
			
			//�ͷ���Դ
			br.close();
			pw.close();
			socket.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
