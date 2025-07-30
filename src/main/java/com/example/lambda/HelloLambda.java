package com.example.lambda;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

/**
 * Simple AWS Lambda handler that returns a greeting.
 */
public class HelloLambda implements RequestHandler<String, String> {
    @Override
    public String handleRequest(String input, Context context) {
        String name = (input == null || input.isBlank()) ? "world" : input;
        return "Hello, " + name + "!";
    }
}
