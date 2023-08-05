package com.keyon.functional;

@FunctionalInterface
public interface BranchHandler {
    void branch(Runnable a, Runnable b);
}
