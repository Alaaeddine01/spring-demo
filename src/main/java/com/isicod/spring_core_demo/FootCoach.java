package com.isicod.spring_core_demo;


import org.springframework.cache.Cache;
import org.springframework.stereotype.Component;

@Component
public class FootCoach implements Coach {


    @Override
    public String getDailyWorkout() {
        return "get daily workout for 15 min , foot coach !";
    }
}
