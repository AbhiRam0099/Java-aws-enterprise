package com.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HelloLambdaTest {
    @Test
    void testHandleRequestWithName() {
        HelloLambda handler = new HelloLambda();
        String result = handler.handleRequest("Codex", null);
        assertEquals("Hello, Codex!", result);
    }

    @Test
    void testHandleRequestWithNull() {
        HelloLambda handler = new HelloLambda();
        String result = handler.handleRequest(null, null);
        assertEquals("Hello, World!", result);
    }
}
