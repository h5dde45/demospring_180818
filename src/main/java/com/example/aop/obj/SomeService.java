package com.example.aop.obj;

import org.springframework.stereotype.Component;

@Component
public class SomeService {
    public int getIntValue() {
        return 5;
    }

    public double getDoubleValue() {
        return 5.5;
    }
}
