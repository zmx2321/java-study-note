/**
 * ���������㷨
 */

package SESenior.leetcode.eg.spiralMatrixAlgorithm;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrixAlgorithm {
	public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>(50);

        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return result;
        }

        // ֻ��һ�е����
        if (matrix.length == 1) {
            for (int i : matrix[0]) {
                result.add(i);
            }

            return result;
        }

        // ֻ��һ�е����
        if (matrix[0].length == 1) {
            for (int i = 0; i < matrix.length; i++) {
                result.add(matrix[i][0]);
            }

            return result;
        }

        // �����ж���Ȧ
        int row = matrix.length;
        int col = matrix[0].length;
        int cycle = row < col ? row : col;
        cycle = (cycle + 1) / 2;

        int round = 0; // ��¼��ǰ�ǵڼ�Ȧ
        int left = 0;
        int right = matrix[0].length - 1;
        int top = 0;
        int down = matrix.length - 1;
        int total = col*row;
        int count = 0;
        while (round < cycle) {

            // ����һ��
            for (int i = left; i <= right && count < total; i++) {
                count++;
                result.add(matrix[round][i]);
            }
            top++; //

            // �ұ�һ��
            for (int i = top; i <= down && count < total; i++) {
                count++;
                result.add(matrix[i][col - round - 1]);
            }
            right--;

            // ����һ��
            for (int i = right; i >= left && count < total; i--) {
                count++;
                result.add(matrix[row - round - 1][i]);

            }
            down--;

            // ���һ��
            for (int i = down; i >= top && count < total; i--) {
                count++;
                result.add(matrix[i][round]);
            }
            left++;

            round++;
        }

        return result;
    }
}
