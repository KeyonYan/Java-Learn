package com.keyon.strategy;

public interface ApplePredicate extends Predicate<Apple> {
    boolean accept(Apple apple);
}
