package SESenior.video.note.IO;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataInputOutputStreamDemo {
	public static void main(String[] args) throws IOException {
		String name = "zzzz";
		int age = 10;
		boolean flag = true;
		char sex = '��';
		double money = 100.56;

		//����������װ��
		DataOutputStream dos = new DataOutputStream(new FileOutputStream("D:\\_site_\\aaa\\CCD.TXT"));

		//д��
		dos.writeUTF(name);
		dos.writeInt(age);
		dos.writeBoolean(flag);
		dos.writeChar(sex);
		dos.writeDouble(money);

		//�ر���Դ
		dos.close();

		//��ȡ
		DataInputStream dis = new DataInputStream(new FileInputStream("D:\\_site_\\aaa\\CCD.TXT"));

		//����˳������д��˳��һ��
		System.out.println(dis.readUTF());
		System.out.println(dis.readInt());
		System.out.println(dis.readBoolean());
		System.out.println(dis.readChar());
		System.out.println(dis.readDouble());

		//�ر���Դ
		dis.close();
	}
}
