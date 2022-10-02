package com.example.waspractice;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

class QueryStringsTest {

    @Test
    void createTest(){
        QueryStrings queryStrings = new QueryStrings("operand1=1&operator*=&operand2=55");

        assertThat(queryStrings).isNotNull();

    }

}