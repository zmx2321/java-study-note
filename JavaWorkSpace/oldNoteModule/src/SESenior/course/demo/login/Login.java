package SESenior.course.demo.login;

import java.util.Scanner;

public class Login {
	public static void main(String[] args) {
		String pwd = null;
		boolean flag = true;  //����ѭ��������
		Scanner in = new Scanner(System.in);
		
		while(flag){
			System.out.println("���������룺");
			pwd = in.next();
			
			if(pwd.equals("password")){
				System.out.println("��¼�ɹ���");
				flag = false;
			}else{
				System.out.println("��¼ʧ�ܣ�");
			}
		}
		
		in.close();
	}
}
