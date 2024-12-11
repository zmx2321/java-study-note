package SESenior.course.demo.login;

import java.util.Scanner;

public class Login3 {
	public static void main(String[] args) {
		int op = 0;  //ѡ��
		boolean flag = true;
		Scanner in = new Scanner(System.in);
		
		do{
			System.out.println("1.��¼");
			System.out.println("2.ע��");
			System.out.println("0.�˳�");
			System.out.println("������ѡ�");
			op = in.nextInt();
			
			switch (op) {
				case 1:
					System.out.println("��¼");
					break;
				case 2:
					System.out.println("ע��");
					break;
				case 0:
					System.out.println("��ӭʹ�ã��´�������");
					flag = false;
					break;
				default:
					System.out.println("������������ѡ��");
					break;
			}
		}while(flag);
		
		in.close();
	}
}
