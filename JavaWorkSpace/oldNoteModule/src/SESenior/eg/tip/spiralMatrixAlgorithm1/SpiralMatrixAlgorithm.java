/**
 * ���������㷨
 */

package SESenior.eg.tip.spiralMatrixAlgorithm1;

import java.util.Scanner;

public class SpiralMatrixAlgorithm {
	private int n; //
    private int a[][]; // ����һ������
    private int value = 1;// ���������ֵ�ֵ
 
    public SpiralMatrixAlgorithm(int i) {
        this.n = i;
        a = new int[n][n];
    }
 
    // �����m�����Ͻǵ�����
    private int getcorner(int m) {
        int corner = 1;
        int o = n - 1;
        for (int i = 0; i < m - 1; ++i) {
            corner += 4 * o;
            o = o - 2;
        }
        return corner;
    }
 
    // ���ɾ����ÿһ���ÿһ�ߵ���
    // s��ʾ4�����򣬷ֱ�ȡֵ1,2,3,4����ʾ4����ͬ�ķ���
    // o��ʾ�����ߵ���ʼֵ��
    // x��ʾ��m��ÿ���ߵ����ָ���
    private void side(int s, int o, int x, int m) {
        int i = 0;
        int j = 0;
        switch (s) {
        case 1:
            i = m - 1;
            j = m - 1;
            for (int k = 0; k < x; ++k) {
                a[i][j + k] = value;
                ++value;
            }
 
            break;
        case 2:
            i = m - 1;
            j = m - 1 + x;
            for (int k = 0; k < x; ++k) {
                a[i + k][j] = value;
                ++value;
            }
            break;
        case 3:
            i = m - 1 + x;
            j = m - 1 + x;
            for (int k = 0; k < x; ++k) {
                a[i][j - k] = value;
                ++value;
            }
            break;
        case 4:
            i = m - 1 + x;
            j = m - 1;
            for (int k = 0; k < x; ++k) {
                a[i - k][j] = value;
                ++value;
            }
            break;
        }
    }
 
    // �������ξ���ĵ�m��
    @SuppressWarnings("unused")
	private void shell(int m)// m��ʾ��m��
    {
        int x = n - 1 - (m - 1) * 2; // x��ʾ��m��ÿ���ߵ����ָ���
        int o = getcorner(m);
        int o1 = o;
        int o2 = o1 + x;
        int o3 = o2 + x;
        int o4 = o3 + x;
        // System.out.println(o4);
 
        side(1, o, x, m);
        side(2, o, x, m);
        side(3, o, x, m);
        side(4, o, x, m);
    }
 
    // �������ξ���
    public void snakeMatrix() {
        int m = (n + 1) / 2;// ����һ���ж��ٲ�
        for (int i = 1; i <= m; ++i) {
 
            shell(i);
        }
        if (n % 2 == 1) {
            a[n / 2][n / 2] = n * n;
        }
 
    }
 
    // ��ӡ����
    public void print() {
        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < n; ++j) {
                if (a[i][j] < 10) {
                    System.out.print(a[i][j] + "  ");
                } else {
                    System.out.print(a[i][j] + " ");
                }
 
            }
            System.out.println();
        }
    }
 
    @SuppressWarnings("resource")
	public static void main(String args[]) {
    	System.out.print("���������㷨--��������Ҫ��ʾ��������");
		SpiralMatrixAlgorithm my = new SpiralMatrixAlgorithm(new Scanner(System.in).nextInt());  //����Scanner��ȡ����̨����
        my.snakeMatrix();
        my.print();
    }
}
