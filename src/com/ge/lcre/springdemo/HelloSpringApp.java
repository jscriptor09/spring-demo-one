package com.ge.lcre.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Mark on 6/5/2016.
 */
public class HelloSpringApp {
    public static void main(String[] args){
        //load the spring configuration files
        ClassPathXmlApplicationContext context=  new ClassPathXmlApplicationContext("applicationContext.xml");

        //retrieve a bean from spring ccontainer
        Coach theTrackCoach = context.getBean("myTrackCoach", Coach.class);
        Coach theBaseballCoach = context.getBean("myBaseballCoach", Coach.class);
        //Coach theCricketCoach = context.getBean("myCricketCoach", Coach.class);

        CricketCoach theCricketCoach = context.getBean("myCricketCoach", CricketCoach.class);
        //Call methind on the bean
        System.out.println(theTrackCoach.getDailyWorkout());
        System.out.println(theTrackCoach.getDailyFortune());
        System.out.println(theBaseballCoach.getDailyWorkout());
        System.out.println(theBaseballCoach.getDailyFortune());
        System.out.println(theCricketCoach.getDailyWorkout());
        System.out.println(theCricketCoach.getDailyFortune());
        //
        //
        System.out.println(theCricketCoach.getTeam());
        System.out.println(theCricketCoach.getEmailAddress());

        //System.out.println(theCricketCoach.getDailyFortune());

        // close the context.
        context.close();
    }
}
