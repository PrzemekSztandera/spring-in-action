package com.psh3mo.springinaction.chapter_4.concert;

import org.springframework.stereotype.Component;

@Component
public class ClassicPerformance implements Performance {

    @Override
    public void perform() {
        System.out.println("Performing classic performance");
    }
}
