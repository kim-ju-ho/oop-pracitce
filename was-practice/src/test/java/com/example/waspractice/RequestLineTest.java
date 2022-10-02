package com.example.waspractice;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class RequestLineTest {
    /*
     * HttpRequest
     *  GET /calculate?operand1=1&operator*=&operand2=55 HTTP/1.1
     */

    @Test
    void create(){
        RequestLine requestLine = new RequestLine("GET /calculate?operand1=1&operator*=&operand2=55 HTTP/1.1");

        assertThat(requestLine).isNotNull();
        assertThat(requestLine).isEqualTo(new RequestLine("GET","/calculate","operand1=1&operator*=&operand2=55"));
    }
}
