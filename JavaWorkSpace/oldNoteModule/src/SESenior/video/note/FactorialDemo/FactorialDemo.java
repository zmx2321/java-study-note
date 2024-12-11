/*
 *  �ݹ���׳�
 */

package SESenior.video.note.FactorialDemo;

public class FactorialDemo {
	public static void main(String[] args) {
		System.out.println(FacUtil.getFac(5));
	}
}

//������
class FacUtil{
	//�ṩһ�������ľ�̬�������ⲿ����
	public static int getFac(int number){
		if(number==1){
			return 1;
		}else{
			//n*(n-1)!
			return number*getFac(number-1);
		}
	}
}