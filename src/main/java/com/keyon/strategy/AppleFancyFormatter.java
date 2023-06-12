package com.keyon.strategy;

public class AppleFancyFormatter implements AppleFormatter {
    @Override
    public String accept(Apple apple) {
        if (apple.getWeight() > 100) {
            return "A Heavy apple";
        } else {
            return "A Light apple";
        }
    }
}
