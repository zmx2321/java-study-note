/**
 * ����������������x��k�����Ƕ���repeat(x, k)Ϊ��x�ظ�дk���γɵ���
 * ����repeat(1234, 2) = 12341234, repeat(20, 3) = 202020
 * ���ڸ���4������x1, k1, x2, k2, ����
 * v1 = (x1, k1)
 * v2 = (x2, k2)
 * �Ƚ�v1��v2�Ĵ�С
 */

package SESenior.dm.tip.loopNumCompare;

import java.util.InputMismatchException;
import java.util.Scanner;

public class LoopNumCompare {
	//������
	public static void main(String[] args) {
		System.out.println("repeat(x, k) ==> ��x�ظ�дk��");
		
		//�������
		String x1="", x2="";
		int k1=0, k2=0;
		
		//��ȡ����
		Scanner in = new Scanner(System.in);
		
		//�쳣
		try{
			//x1��k1
			System.out.print("x1��");
			x1 = in.next();
			System.out.print("k1��");
			k1 = in.nextInt();
			
			//x2��k2
			System.out.print("x2��");
			x2 = in.next();
			System.out.print("k2��");
			k2 = in.nextInt();
		}catch(InputMismatchException e){
			System.out.println("������������\n���������");
			System.exit(0);
		}catch(Exception e){
			System.out.println("������������\n���������");
			System.exit(0);
		}
		
		//���ñȽϷ���
		System.out.println(repeat(x1, k1, x2, k2));
		
		//�رռ���
		in.close();
	}

	//�ȽϷ���
	public static String repeat(String x1, int k1, String x2, int k2){
		String s1="", s2="";  //���repeat(x, k)�õ����ַ���
		long v1=0, v2=0;  //�����ֵv
		int i;  //ѭ��
		
		//repeat(x1, k1)��v1
		for(i=0; i<k1; i++){
			s1 += x1;
		}
		System.out.println("v1:" + s1);
		
		//repeat(x1, k1)��v2
		for(i=0; i<k2; i++){
			s2 += x2;
		}
		System.out.println("v2:" + s2);
		
		//�쳣
		try{
			//���ַ���ת����ֵ���ͣ�����ֵ��v
			v1 = Long.parseLong(s1);
			v2 = Long.parseLong(s2);
		}catch(NumberFormatException e){
			System.out.println("error��" + e.getMessage());
			System.out.println("�������볬���޶�ֵ\n���������");
			System.exit(0);
		}
		
		//�ȽϺͷ���
		if(v1==v2){
			return "Equal";
		}else{
			return v1<v2?"Less(v1<v2)":"Greater(v1>v2)";
		}
	}
}
