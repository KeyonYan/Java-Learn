package com.keyon.functional;

import java.util.function.Consumer;

@FunctionalInterface
public interface PresentOrElseHandler<T> {
    void present(Consumer action, Runnable handler);
}
