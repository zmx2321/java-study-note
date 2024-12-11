package SESenior.course.demo.loop;

public class Loop {
	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {  //������������
			for (int j = 4-i; j >0; j--) {  //ÿ�пո���
				System.out.print(" ");
			}
			
			for (int j = 0; j < i; j++) {  //ÿ��*��
				System.out.print("*");
			}
			
			System.out.println();
		}
	}
}
