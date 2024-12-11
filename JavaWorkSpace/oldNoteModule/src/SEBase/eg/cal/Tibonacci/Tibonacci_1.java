/*
 *  编写程序在控制台输出斐波那契数列前20项，每输出5个数换行
 */

package eg.cal.Tibonacci;

public class Tibonacci_1 {
    // 定义三个变量方法
    public static void main(String[] args) {
        int a = 1, b = 1, c = 0;
        System.out.println("斐波那契数列前20项为：");
        System.out.print(a + "\t" + b + "\t");
        //因为前面还有两个1、1 所以i<=18
        for (int i = 1; i <= 18; i++) {
            c = a + b;
            a = b;
            b = c;
            System.out.print(c + "\t");
            if ((i + 2) % 5 == 0)
                System.out.println();
        }
    }
}
