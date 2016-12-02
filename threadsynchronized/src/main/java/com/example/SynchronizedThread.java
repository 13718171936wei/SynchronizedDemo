package com.example;

/**
 * Created by 行走的力量 on 2016/12/2.
 */


/**
 * 线程同步的运用
 * 存取款事例
 */
public class SynchronizedThread {

    public static void main(String[] args) {
        SynchronizedThread synchronizedThread = new SynchronizedThread();
        synchronizedThread.useThread();

    }

    /**
     * 建立线程
     */

    public void useThread() {

        Bank bank = new Bank();
        NewThread t1 = new NewThread(bank);
        System.out.println("线程1");

        Thread t2 = new Thread(t1);
        t2.start();
        System.out.println("线程2");

        Thread t3 = new Thread(t1);
        t3.start();
        System.out.println("线程3");
    }
}
