package SESenior.course.note.file;

/**
 * �ݹ�
 */

public class Class2 {
	public static void main(String[] args) {
		test(10);
	}
	
	public static void test(int value){
		System.out.println(value);
		if(value == 0) {
			return;
		} else {
 			test(--value);
			//������value--��
		}
		/*System.out.println(value);
		test(--value);
		ֱ�������û������*/
	}
}
