package SEBase.step3.course.course.day11_13;

public class Demo_1 {
	public static void main(String[] args) {
		double num = 12.45;
		//1、值变成一个整数*100，2、转成整型数/10，3、还原浮点并/10
		num = (int)(num*100)/10/10.0;
		System.out.println(num);
	}
}
