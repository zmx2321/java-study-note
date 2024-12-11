package SESenior.video.eg.socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class ServerStream implements Runnable {
	//ͨ��IO�Կͻ��˶�д����
	private Socket socket = null;
	private int number;
	
	//���ɴ�2�������Ĺ��췽��
	public ServerStream(Socket socket, int number) {
		super();
		this.socket = socket;
		this.number = number;
	}

	@Override
	public void run() {
		//��ȡ�ͻ��˴��������ַ���(ͨ��IO�е�������)
		//�ַ���(�ֽ���ת�ַ���)
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			//д(�õ���Ӧ���ֽ�����������Զ�ˢ�»�����)
			PrintWriter pw = new PrintWriter(socket.getOutputStream(), true);
			//ֻҪ�ͻ��˷���������һֱ��
			while(true){
				String line = br.readLine();  //�����ͻ��˴��������ַ���
				System.out.println("�ͻ���" + number + ":" + line);
				pw.println(line.toUpperCase());
				if(line.equals("bye")){
					System.out.println("�ͻ���" + number + "�Ѿ��Ͽ�����");
					break;
				}
			}
			br.close();
			pw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
