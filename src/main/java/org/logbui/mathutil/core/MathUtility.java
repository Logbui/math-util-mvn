/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.logbui.mathutil.core;

/**
 *
 * @author ADMIN
 */
public class MathUtility {
    public static final double PI = 3.1415;
    //hàm này tính n! = 1.2.3...n
    //thiết kế hàm này như sau
    //0! = 1! = 1
    //ko có âm giai thừa. Nếu đưa -1!, -5!, -10!: CHỬI - NÉM NGOẠI LỆ
    //long: 18 con số 0
    //21 giai thừa kiểu long chứa ko đc
    //hàm chỉ cho phép n = 0..20
    //đưa n > 20; chửi, ném ra exception
//    public static long getFactorial(int n){
//        if(n < 0 || n > 20){
//            throw new IllegalArgumentException("Invalid n. n must be between 0..20, plz");
//        }
//        if(n == 0 || n == 1){
//            return 1;
//        }
//        long product = 1;
//        for(int i = 2; i <= n; i++){
//            product *= i;
//        }
//        return product;
//    }
    
    public static long getFactorial(int n){
        if(n < 0 || n > 20){
            throw new IllegalArgumentException("Invalid n. n must be between 0..20, plz");
        }
        if(n == 0 || n == 1){
            return 1;
        }
        return n * getFactorial(n-1);//recursion
    }
}
//5! = 1.2.3.4.5 = 4! x 5 = 5 x 4!
//4! = 4 x 3!
//3! = 3 x 2!
//2! = 2 x 1!
//1! = 1; DỪNG
//N = N x (N-1)!