/**
 * ���������㷨
 */

package SESenior.eg.tip.spiralMatrixAlgorithm2;

public class SpiralMatrixAlgorithm {
	public static void main(String[] args) {  
        int m = 5;/*��*/  
        int n = 6;/*��*/  
        int[][] pos = new int[m][n];/*λ��*/  
        /** 
         * λ�ýṹ���£� 
         * [0][0],[0][1],[0][2],[0][3],[0][4] 
         *  
         * [1][0],[1][1],[1][2],[1][3],[1][4] 
         *  
         * [2][0],[2][1],[2][2],[2][3],[2][4] 
         *  
         * [3][0],[3][1],[3][2],[3][3],[3][4] 
         *  
         * [4][0],[4][1],[4][2],[4][3],[4][4] 
         */  
        int count = 0;  
        int r = 0, c = 0;/*r:���±�    c:���±�    pos[r][c]��Ӧ����λ��*/  
        /*��ֵ����������c++��������r++��������c--��������r--*/  
        final int up = 1;  
        final int  down = -1;  
        final int left = 2;  
        final int right = -2;  
        int dir = right;/*��ʼ����*/  
        int cir = 1;/* �ڼ�Ȧ��ֵ */  
        while(true){  
            count++;  
            pos[r][c]=count;/*��ֵ*/  
            switch(dir){  
                case right:  
                    if(c<n-cir){/*��ǰ���ҷ�����û��ֵ��*/  
                        c++;  
                    }else{  
                        dir = down;  
                        r++;  
                    }  
                    break;  
                case down:  
                    if(r<m-cir){/*��ǰ���·�����û��ֵ��*/  
                        r++;  
                    }else{  
                        dir = left;  
                        c--;  
                    }  
                    break;  
                case left:  
                    if(c>cir-1){/*��ǰ����߻���û��ֵ��*/  
                        c--;  
                    }else{  
                        dir = up;  
                        r--;  
                    }  
                    break;  
                case up:  
                    if(r>cir){/*��ǰ���ϱ߱߻���û��ֵ��*/  
                        r--;  
                    }else{  
                        cir++;/*��ֵ��һȦ*/  
                        dir = right;  
                        c++;  
                    }  
                    break;  
            }  
            if(count>=m*n){  
                break;  
            }  
        }  
        /*���*/  
        for(int i = 0; i<m; i++){  
            for(int j = 0; j<n; j++){  
                if(pos[i][j]<10){  
                    System.out.print(pos[i][j]+" "+" ");  
                }else{  
                    System.out.print(pos[i][j]+" ");  
                }  
            }  
            System.out.println();  
        }  
    }  
}
