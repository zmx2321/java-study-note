package com.my.test09;

public class Test02 {
    // throws 抛出去之后,谁调用这个方法谁处理
    public static void devide() throws Exception {
        int num1 = 12;
        int num2 = 0;

        if(num2 == 0) {
            // 人为制造异常
            /*try {
                throw new Exception();
            } catch (Exception e) {
                System.out.println("人为处理异常");
            }*/
            throw new Exception();
        } else {
            System.out.println(num1/num2);
        }
    }

    public static void main(String[] args) {
        try {
            devide();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
