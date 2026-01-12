package com.meta.springprepare.Calculator;

public class Calculator {
    public Double operate(double num1, String op, double num2){
        switch (op){
            case "*":
                return num1 * num2;
            case "/":
                if(num2 !=0){
                    return num1/num2;
                }
                else {
                    throw new IllegalArgumentException("0으로 나눌 수 없습니다.");
                }
            case "+":
                return num1+num2;
            case"-":
                return num1 - num2;
            default:
                throw new IllegalArgumentException("잘못된 연산자를 입력하셨습니다");
        }
    }
}
