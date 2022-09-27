package com.example.ooppractice.calculator;

import java.util.Arrays;

public enum ArithmeticOperator {
    ADDITION("+"){
        @Override
        public int ArithmeticCalculator(int operand1, int operand2) {
            return operand1 + operand2;
        }
    },SUBTRACTION("-") {
        @Override
        public int ArithmeticCalculator(int operand1, int operand2) {
            return operand1 - operand2;
        }
    },MULTIPLICATION("*") {
        @Override
        public int ArithmeticCalculator(int operand1, int operand2) {
            return operand1 * operand2;
        }
    },DIVISION("/") {
        @Override
        public int ArithmeticCalculator(int operand1, int operand2) {
            return operand1 / operand2;
        }
    };

    private final String operator;

    ArithmeticOperator(String operator){
        this.operator=operator;
    }

    public static int calculator(int operand1, String operator, int operand2) {
        ArithmeticOperator arithmeticOperator = Arrays.stream(values())
                .filter(v -> v.operator.equals(operator))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("올바른 사칙연산이 아닙니다."));
        return arithmeticOperator.ArithmeticCalculator(operand1,operand2);
    }

    public abstract int ArithmeticCalculator(final int operand1, final int operand2);
}
