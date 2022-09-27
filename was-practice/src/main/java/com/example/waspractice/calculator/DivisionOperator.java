package com.example.waspractice.calculator;

public class DivisionOperator implements NewArithmeticOperator{

    @Override
    public boolean supports(String operator) {
        return "/".equals(operator);
    }

    @Override
    public int calculate(PositiveNumber operand1, PositiveNumber operand2) {
        // PositiveNumber에서 양수인지를 판별했기때문에 해당 코드는 필요가 없어짐
//        if(operand2.toInt() == 0){
//            throw new IllegalArgumentException("0으로는 나눌 수 없습니다.");
//        }
        return operand1.toInt()/operand2.toInt();
    }
}
