package com.example.demo;

import java.util.function.Function;
import org.springframework.stereotype.Component;

@Component
public class ReverseFunction implements Function<NumberInput, NumberOutput> {

    private final MathService mathService;

    public ReverseFunction(final MathService mathService) {
        this.mathService = mathService;
    }

    @Override
    public NumberOutput apply(final NumberInput input) {
        return new NumberOutput(mathService.reverse(input.getInput()));
    }
}
