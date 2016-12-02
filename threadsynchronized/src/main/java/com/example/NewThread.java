package com.example;

/**
 * Created by 行走的力量 on 2016/12/2.
 */

public class NewThread implements Runnable {

    private Bank bank;

    public NewThread(Bank bank) {
        this.bank = bank;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            bank.save(100);//同步方法
//            bank.save1(100);//同步代码块
            System.out.println(i + "账户余额为：" + bank.getAccount());
        }
    }
}
