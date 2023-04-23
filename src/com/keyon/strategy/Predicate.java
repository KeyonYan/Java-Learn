package com.keyon.strategy;

public interface Predicate<T> {
    boolean accept(T t);
}
