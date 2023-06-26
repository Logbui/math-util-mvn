/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package org.logbui.mathutil.core.test;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import static org.logbui.mathutil.core.MathUtility.*;

/**
 *
 * @author ADMIN
 */
public class MathUtilityAdvancedTest {
    //hàm trả về mảng hai chiều gồm nhiều dòng, 2 cột
    //0 -> 1
    //1 -> 1
    //2 -> 2
    //6 -> 720
    //mảng 2 chiều, cột 0 là n, cột 1 là expected
    //n      expected
    public static Object[][] initTestData(){
        Object testData[][] = {{0, 1},
                               {1, 1},
                               {2, 2},
                               {4, 24},
                               {5, 120},
                              };
        
        return testData;
    }
    
    @ParameterizedTest
    @MethodSource("initTestData")
    public void checkFactorialGivenRightArgumentReturnsWell(int n, long expected){
                                                          //cột 0      cột 1
        assertEquals(expected, getFactorial(n));
        
    }
}

//bắt ngoại lệ thì sao, tức là hàm của ta getF() trả về ngoại lệ
//khi đưa n cà chớn -1, -2, N>20
//JUnit 5 đưa ra hàm mới, AssertThrows()
//hàm này thì lại xài Lambda Expression
//


//TDD: Test Drive Development: là kỹ thuật dành cho dân dev
//     nói về việc viết code chính cần phải dc kiểm tra ngay về chất lượng
//     nên viết code chính đan xen, xen kẽ cùng với việc thiết kế
//     các test case để test code chính
//     Lập trình mà viết code chính và code test (JUnit, Unit Test)
//     đan xen xen kẽ nhay thì gọi là TDD
//     VIẾT CODE HƯỚNG THEO VIỆC KIỂM THỬ NGAY CODE

//DDT: Data Driven Testing: là kỹ thuật mở rộng, bổ sung thêm cho
//     TDD trong đó việc viết code test dc tách riêng ra so với test
//     data nghĩa là bộ dữ liệu test thường đc đặt để ở 1 mảng 2 chiều
//     hoặc để ở table, file txt, Excel sau đó dc nhồi/fill/map vào trong
//     câu lệnh kiểm thử!!!
//     Việc data tách riêng ra, sau đó fill trở lại hàm so sánh qua
//     tên biến THÌ DDT CÒN ĐC GỌI LÀ PARAMETERIZED TESTING