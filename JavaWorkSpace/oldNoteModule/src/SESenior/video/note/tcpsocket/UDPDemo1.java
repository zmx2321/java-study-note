package SESenior.video.note.tcpsocket;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UDPDemo1 {
	public static void main(String[] args) throws IOException {
		//����һ������
		//����ָ��һ�������Ķ˿ںţ�Ҳ����Ĭ��һ�����췽��(�������˿ں�)
		DatagramSocket socket = new DatagramSocket();
		String str = "i love you!";
		
		//�����ݽ��з�װ(��װ�����ݱ�����
		//���͹�ȥ�����ݣ����ֽ�����ķ�ʽ���ͣ��ַ���ת�����ֽ�����
		//���͵����ݵĳ���
		//���͸���̨�����������������õ�IP��ַ
		//Ŀ��(���ն�)��������Ӧ�Ķ˿ں�
		DatagramPacket packet = new DatagramPacket(str.getBytes(), str.length(), InetAddress.getByName("localhost"), 8600);
		//����
		socket.send(packet);
		//�����������������������ݰ�
		byte[] buff = new byte[100];
		DatagramPacket packet2 = new DatagramPacket(buff, 100);  //���ݰ����������ݷŵ�buff�����100
		//���մ����������ݰ�
		socket.receive(packet2);
		
		//System.out.println(new String(packet2.getData()));
		System.out.println(new String(buff, 0, packet.getLength()));
		
		socket.close();
		
	}
}
