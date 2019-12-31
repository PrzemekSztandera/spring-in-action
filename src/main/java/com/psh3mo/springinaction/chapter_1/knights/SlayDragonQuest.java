package com.psh3mo.springinaction.chapter_1.knights;

public class SlayDragonQuest implements Quest {

/**
    Does not work with PrintStream
 */

//    private PrintStream stream;

    /*public SlayDragonQuest(PrintStream stream) {
        this.stream = stream;
    }*/


    @Override
    public void embark() {
        System.out.println("Embarking on quest to slay the dragon!");
//        stream.println("Embarking on quest to slay the dragon!");
    }
}
