package com.firsthead.startegy;

/**
 * Created by Administrator on 2017/12/7.
 */
public abstract class Duck {
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;



    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }


    public void swinm(){
        System.out.println("所有鸭子都会游泳");
    }

    public void display(){
        System.out.println("默认是鸭子");
    }

    public void performFly(){
        this.flyBehavior.fly();
    }

    public void performQuack(){
        this.quackBehavior.quack();
    }
}
