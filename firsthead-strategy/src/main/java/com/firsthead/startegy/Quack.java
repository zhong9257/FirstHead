package com.firsthead.startegy;

/**
 * Created by Administrator on 2017/12/7.
 */
public class Quack implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("现实呱呱叫");
    }
}
