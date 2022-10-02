package com.example.waspractice;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class QueryStringTest {

    //operand1=1&operator*=&operand2=55

    //List<QueryString>
    @Test
    void creatTest(){
        QueryString queryString = new QueryString("operand1","11");

        Assertions.assertThat(queryString).isNotNull();
    }
}
