package com.psh3mo.springinaction.chapter_3.dessert;

import org.springframework.stereotype.Component;

@Component
@Cold
public class IceCream implements Dessert {

    @Override
    public void makeDessert() {
        System.out.println("Making IceCream!!!");
    }
}
