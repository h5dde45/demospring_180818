package com.example.objects;

import com.example.objects.interfaces.Hand;
import com.example.objects.interfaces.Head;
import com.example.objects.interfaces.Leg;

public class Robot {

    private Hand hand;
    private Head head;
    private Leg leg;

    public Robot(Head head, Hand hand, Leg leg) {
        this.head = head;
        this.hand = hand;
        this.leg = leg;
    }

    public void action() {
        head.calc();
        hand.catchSomething();
        leg.go();
    }
}
