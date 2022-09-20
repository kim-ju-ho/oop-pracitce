package com.example.ooppractice.password;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;


class UserTest {

    @DisplayName("패스워드 초기화 여부를 판단하다.")
    @Test
    void passwordTest(){
        // given
        User user = new User();
        // when
        // 구현체를 만들어서 주입할 필요없이 람다를 이용해서 사용할 수도 있음
        // interface를 이용해서 결합도를 낮추웠기때문
        user.initPassword(()->"abcdefg");
        // then
        assertThat(user.getPassword()).isNotNull();
    }

    @DisplayName("패스워드가 요구사항에 부합되지 않아 초기화가 되지 않는다")
    @Test
    void passwordTest2(){
        // given
        User user = new User();
        // when
        user.initPassword(new WrongFixedPasswordGenerator());
        // then
        assertThat(user.getPassword()).isNull();
    }

}