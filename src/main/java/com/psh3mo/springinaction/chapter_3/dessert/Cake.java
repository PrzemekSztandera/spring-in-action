package com.psh3mo.springinaction.chapter_3.dessert;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("cake")
public class Cake implements Dessert {

    @Override
    public void makeDessert() {
        System.out.println("Making Cake!!!");
    }
}
