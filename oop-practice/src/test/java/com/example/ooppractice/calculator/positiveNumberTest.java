package com.example.ooppractice.calculator;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class positiveNumberTest {

    @Test
    @ParameterizedTest
    @ValueSource(ints = {0,-1})
    void createTest(int value){
        Assertions.assertThatCode(()-> new PositiveNumber(value))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("0 또는 음수를 전달할 수 없습니다.");
    }
}
