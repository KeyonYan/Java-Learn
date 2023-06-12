package com.keyon.concurrent.myAQS;

import java.io.Serializable;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.AbstractQueuedSynchronizer;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;

public class NonReentrantLock implements Lock, Serializable {

    private static class Sync extends AbstractQueuedSynchronizer {
        // 是否锁已经被持有
        protected boolean isHeldExclusively() {
            return getState() == 1;
        }

        // 如果state为0，则尝试获取锁
        public boolean tryAcquire(int acquires) {
            assert acquires == 1;
            if (compareAndSetState(0, 1)) { // CAS: 如果state为0，则尝试获取锁
                setExclusiveOwnerThread(Thread.currentThread()); // 设置当前线程为独占线程
                return true;
            }
            return false;
        }

        // 尝试释放锁，设置state为0
        protected boolean tryRelease(int releases) {
            assert releases == 1;
            if (getState() == 0) { // 如果state为0，抛出异常
                throw new IllegalMonitorStateException();
            }
            setExclusiveOwnerThread(null); // 设置当前线程为null
            setState(0); // 设置state为0
            return true;
        }

        // 返回一个Condition，每个condition都包含了一个condition队列
        Condition newCondition() {
            return new ConditionObject();
        }
    }

    /**
     * field
     */
    // 创建一个Sync来做具体的工作
    private final Sync sync = new Sync();

    @Override
    public void lock() {
        sync.acquire(1); // 获取锁
    }

    @Override
    public boolean tryLock() {
        return sync.tryAcquire(1); // 尝试获取锁
    }

    @Override
    public void unlock() {
        sync.release(1); // 释放锁
    }

    @Override
    public Condition newCondition() {
        return sync.newCondition();
    }

    public boolean isLocked() {
        return sync.isHeldExclusively(); // 是否锁已经被持有
    }

    @Override
    public void lockInterruptibly() throws InterruptedException {
        sync.acquireInterruptibly(1); // 可中断的获取锁
    }

    @Override
    public boolean tryLock(long time, TimeUnit unit) throws InterruptedException {
        return sync.tryAcquireNanos(1, unit.toNanos(time)); // 尝试获取锁，带超时
    }




}
