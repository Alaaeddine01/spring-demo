package com.isicod.spring_core_demo;


import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach{
    @Override
    public String getDailyWorkout() {
        return "get daily workout for 15 min !!!!";
    }

}
