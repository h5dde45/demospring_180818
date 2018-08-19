package com.example.objects.robots;

import com.example.objects.interfaces.Hand;
import com.example.objects.interfaces.Head;
import com.example.objects.interfaces.Leg;
import com.example.objects.interfaces.Robot;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class ModelT1000 implements Robot, InitializingBean, DisposableBean {

    private Head head;
    private Hand hand;
    private Leg leg;

    private String color;
    private int year;
    private boolean soundEnable;

    public ModelT1000() {
    }

    public ModelT1000(String color, int year, boolean soundEnable) {
        this.color = color;
        this.year = year;
        this.soundEnable = soundEnable;
    }

    public ModelT1000(Head head, Hand hand, Leg leg) {
        this.head = head;
        this.hand = hand;
        this.leg = leg;
    }

    public ModelT1000(Head head, Hand hand, Leg leg, String color, int year, boolean soundEnable) {
        this.head = head;
        this.hand = hand;
        this.leg = leg;
        this.color = color;
        this.year = year;
        this.soundEnable = soundEnable;
    }

    @Override
    public void action() {
        head.calc();
        hand.catchSomething();
        leg.go();
        System.out.println(color);
        System.out.println(year);
        System.out.println(soundEnable);
    }

    @Override
    public void corrode() {
        System.out.println("corrode.....");
    }

    public Hand getHand() {
        return hand;
    }

    public void setHand(Hand hand) {
        this.hand = hand;
    }

    public Head getHead() {
        return head;
    }

    public void setHead(Head head) {
        this.head = head;
    }

    public Leg getLeg() {
        return leg;
    }

    public void setLeg(Leg leg) {
        this.leg = leg;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public boolean isSoundEnable() {
        return soundEnable;
    }

    public void setSoundEnable(boolean soundEnable) {
        this.soundEnable = soundEnable;
    }

    public void initObject() {
        System.out.println("init");
    }

    public void destroyObject() {
        System.out.println("destroy");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println(this + " - method destroy()");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println(this + " - method init()");
    }
}
