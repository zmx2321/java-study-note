/*
 *  ���   
 *    *
 *   * *
 *  * * *
 *  
 */

package SEBase.step3.course.day11_16;

public class Demo_3 {
	public static void main(String[] args) {
		for(int i=1; i<4; i++){
			//�ո�
			for(int j=3-i; j>0; j--){
				System.out.print(" ");
			}
			//*��
			for(int j=0; j<i; j++){
				System.out.print("* ");
			}
			//����
			System.out.println();
		}
	}
}
