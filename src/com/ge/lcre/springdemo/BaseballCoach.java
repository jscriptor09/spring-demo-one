package com.ge.lcre.springdemo;

/**
 * Created by Mark on 6/5/2016.
 */
public class BaseballCoach implements Coach {


    private FortuneService fortuneService;

    public BaseballCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "spend 30 minutes on batting practice";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
