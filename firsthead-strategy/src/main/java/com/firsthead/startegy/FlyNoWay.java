package com.firsthead.startegy;

/**
 * Created by zhongyi on 2017/12/7.
 */
public class FlyNoWay implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("我没翅膀飞");
    }
}
