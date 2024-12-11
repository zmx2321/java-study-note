package SESenior.video.note.tcpsocket;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class UDPDemo2 {
	public static void main(String[] args) throws IOException {
		DatagramSocket socket = new DatagramSocket(8600);
		
		byte[] buff = new byte[100];
		DatagramPacket packet = new DatagramPacket(buff, 100);
		
		socket.receive(packet);  //���մ��������ݰ�
		
		//System.out.println(new String(packet.getData()));
		//��buff�ֽ������ж�ȡ���ӵ�0����ʼ������length��
		System.out.println(new String(buff, 0, packet.getLength()));
		
		//����
		String str = "Me too!";
		DatagramPacket packet2 = new DatagramPacket(str.getBytes(), str.length(), packet.getAddress(), packet.getPort());
		
		//����
		socket.send(packet2);
		socket.close();
	}
}
