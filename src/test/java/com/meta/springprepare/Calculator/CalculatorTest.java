package com.meta.springprepare.Calculator;

import net.bytebuddy.dynamic.scaffold.FieldLocator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@Nested
@DisplayName("계산기 테스트")
class CalculatorTest {
    //더하기
    @Test
    @DisplayName("더하기 테스트")
    void test1(){
        //Given/When/Then 패턴으로 작성
        Double num1 = 8.0;
        String op = "+";
        Double num2 = 2.0;
        Calculator calculator = new Calculator();

        //When
        Double result =  calculator.operate(num1, op, num2);
        System.out.println("result = " + result);
        
        //then
        Assertions.assertEquals(10, result);
    }
    //빼기
    @Test
    @DisplayName("빼기 테스트")
    void test2(){
        //Given/When/Then 패턴으로 작성
        Double num1 = 8.0;
        String op = "-";
        Double num2 = 2.0;
        Calculator calculator = new Calculator();

        //When
        Double result =  calculator.operate(num1, op, num2);
        System.out.println("result = " + result);

        //then
        Assertions.assertEquals(6, result);
    }

    // 나누기
    @Test
    @DisplayName("나누기 테스트")
    void test3(){
        //Given/When/Then 패턴으로 작성
        Double num1 = 8.0;
        String op = "/";
        Double num2 = 2.0;
        Calculator calculator = new Calculator();

        //When
        Double result =  calculator.operate(num1, op, num2);
        System.out.println("result = " + result);

        //then
        Assertions.assertEquals(4.0, result);
    }

    // 곱하기
    @Test
    @DisplayName("곱하기 테스트")
    void test4(){
        //Given/When/Then 패턴으로 작성
        Double num1 = 8.0;
        String op = "*";
        Double num2 = 2.0;
        Calculator calculator = new Calculator();

        //When
        Double result =  calculator.operate(num1, op, num2);
        System.out.println("result = " + result);

        //then
        Assertions.assertEquals(16, result);
    }

    //예외
    @Test
    @DisplayName("예외 테스트")
    void test5(){
        //Given/When/Then 패턴으로 작성
        Double num1 = 8.0;
        String op = "%";
        Double num2 = 2.0;
        Calculator calculator = new Calculator();

        //When
        IllegalArgumentException thrown = Assertions.assertThrows(
                IllegalArgumentException.class,
                ()-> calculator.operate(num1, op, num2)
        );

        //then
        Assertions.assertEquals("잘못된 연산자를 입력하셨습니다",thrown.getMessage());
    }

    @Test
    @DisplayName("예외 테스트2")
    void test6(){
        //Given/When/Then 패턴으로 작성
        Double num1 = 8.0;
        String op = "/";
        Double num2 = 0.0;
        Calculator calculator = new Calculator();

        //When
        IllegalArgumentException thrown = Assertions.assertThrows(
                IllegalArgumentException.class,
                ()-> calculator.operate(num1, op, num2)
        );

        //then
        Assertions.assertEquals("0으로 나눌 수 없습니다.",thrown.getMessage());
    }
}
