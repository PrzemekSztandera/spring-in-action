package com.psh3mo.springinaction.chapter_3.dessert;

import org.springframework.stereotype.Component;

@Component
public class Cookies implements Dessert {

    @Override
    public void makeDessert() {
        System.out.println("Making Cookie!!!");
    }
}
