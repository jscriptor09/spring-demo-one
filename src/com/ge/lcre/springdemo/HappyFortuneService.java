package com.ge.lcre.springdemo;

/**
 * Created by Mark on 6/5/2016.
 */
public class HappyFortuneService implements FortuneService {
    public String getFortune() {
        return "Today is your lucky day!";
    }
}
