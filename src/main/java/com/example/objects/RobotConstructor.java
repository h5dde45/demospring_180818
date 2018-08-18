package com.example.objects;

import com.example.objects.sony.SonyHand;
import com.example.objects.sony.SonyHead;
import com.example.objects.sony.SonyLeg;

public class RobotConstructor {
    public static void main(String[] args) {
        Robot robot = new Robot(new SonyHead(),new SonyHand(),new SonyLeg());
//        Robot robot = new Robot(new ToshHead(),new ToshHand(),new ToshLeg());
        robot.action();
    }
}
