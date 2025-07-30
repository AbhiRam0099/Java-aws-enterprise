package com.example;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

public class HelloLambda implements RequestHandler<String, String> {
    @Override
    public String handleRequest(String input, Context context) {
        if (input == null) {
            return "Hello, World!";
        }
        return "Hello, " + input + "!";
    }
}
