package com.keyon.strategy;

public class AppleSimpleFormatter implements AppleFormatter {
    @Override
    public String accept(Apple apple) {
        return String.format("A apple of %dg", apple.getWeight());
    }
}
