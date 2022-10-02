package com.example.waspractice.calculator.domain;


import com.example.waspractice.calculator.tobe.AdditionOperator;
import com.example.waspractice.calculator.tobe.DivisionOperator;
import com.example.waspractice.calculator.tobe.MultiplicationOperator;
import com.example.waspractice.calculator.tobe.SubtractionOperator;

import java.util.List;

public class Calculator {
    private static final List<NewArithmeticOperator> arithmeticOperators = List.of(new AdditionOperator(), new MultiplicationOperator(), new DivisionOperator(), new SubtractionOperator());

    public static int calculator(PositiveNumber operand1, String operator, PositiveNumber operand2) {

        try{
            Thread.sleep(5_000L);

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return arithmeticOperators.stream()
              .filter(arithmeticOperators -> arithmeticOperators.supports(operator))
              .map(arithmeticOperators -> arithmeticOperators.calculate(operand1,operand2))
              .findFirst()
              .orElseThrow(()-> new IllegalArgumentException("올바른 사칙연산이 아닙니다."));
    }
}
