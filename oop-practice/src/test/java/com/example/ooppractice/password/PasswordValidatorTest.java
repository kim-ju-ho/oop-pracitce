package com.example.ooppractice.password;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;


import static org.assertj.core.api.Assertions.assertThatCode;

/*
 • 비밀번호는 최소 8자 이상 12자 이하여야 한다.
 • 비밀번호가 8자 미만 또는 12자 초과인 경우 IllegalArgumentException 예외를 발생시킨다.
 • 경계조건에 대해 테스트 코드를 작성해야 한다.
*/
public class PasswordValidatorTest {

    @DisplayName("비밀번호가 최소 8자 이상 12이하면 예외가 발생하지 않는다.")
    @Test
    void validatePasswordTest(){
        assertThatCode(() -> PasswordValidator.validate("serㅇㅇvice"))
                .doesNotThrowAnyException();
    }

    @DisplayName("비밀번호가 8자 미만 12자 초과하는 경우 IllegalArgumentException 예외가 발생")
    @ParameterizedTest
    // DataSource를 이용하여 테스트 메소드 파라미터를 세팅할 수 있다.
    @ValueSource(strings = {"aabbcce", "aabbccddeeffgg"})
    @Test
    void validatePasswordTest2(String password){

        assertThatCode(()->PasswordValidator.validate("aabb"))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("비밀번호는 최소 8자 이상 12자 이하여야 한다.");



    }

}
