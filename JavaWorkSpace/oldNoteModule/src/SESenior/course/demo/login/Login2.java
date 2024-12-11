package SESenior.course.demo.login;

import java.util.Scanner;

public class Login2 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("���������룺");
		
		//falseѭ��������true����ѭ��,����Ҫȡ��
		while(!in.next().equals("password")){
			System.out.println("��¼ʧ�ܣ����������룺");
		}
		
		System.out.println("��¼�ɹ���");
		in.close();
	}
}
