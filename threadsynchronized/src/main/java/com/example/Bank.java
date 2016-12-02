package com.example;

public class Bank {
    private int account = 100;

    public int getAccount() {
        return account;
    }

    /**
     * 同步方法实现
     * 获取当前方法的内置锁
     */
    public synchronized void save(int money) {
        account += money;
    }

    /**
     * 用同步代码块实现
     */
    public synchronized void save1(int money) {
        synchronized (this) {
            account += money;
        }
    }
}
