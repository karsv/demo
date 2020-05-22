package com.example.demo;

import org.springframework.cloud.function.adapter.aws.SpringBootRequestHandler;

public class ReverseFunctionHandler extends SpringBootRequestHandler<NumberInput, NumberOutput> {
}
