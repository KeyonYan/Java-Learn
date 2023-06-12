package com.keyon.concurrent.myAQS;

import java.util.ArrayList;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * 自定义线程安全的ArrayList
 * 考虑读多写少的情况，使用读写锁
 * @param <T>
 */
public class ReentrantLockList<T> {

    private ArrayList<T> arr = new ArrayList<>();
    private final ReentrantReadWriteLock lock = new ReentrantReadWriteLock();
    private final Lock readLock = lock.readLock();
    private final Lock writeLock = lock.writeLock();

    public void add(T e) {
        writeLock.lock();
        try {
            arr.add(e);
        } finally {
            writeLock.unlock();
        }
    }

    public void remove(T e) {
        writeLock.lock();
        try {
            arr.remove(e);
        } finally {
            writeLock.unlock();
        }
    }

    public T get(int index) {
        readLock.lock();
        try {
            return arr.get(index);
        } finally {
            readLock.unlock();
        }
    }

}
