package com.psh3mo.springinaction.chapter_4.concert;

public class DefaultEncoreable implements Encoreable {

    @Override
    public void performEncore() {
        System.out.println("Performing encore???");
    }
}
