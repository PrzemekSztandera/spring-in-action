package com.psh3mo.springinaction.chapter_2.soundsystem;

import org.springframework.stereotype.Component;

//@Component
//@Component("lonelyHeartsClub")
//an alternative to @Component
//@Named("lonelyHeartsClub")
public class SgtPeppers implements CompactDisc {

    private String title = "Sgt. Pepper's Lonely Hearts Club Band";
    private String artist = "The Beatles";

    @Override
    public void play() {
        System.out.println("Playing " + title + " by " + artist);
    }

    @Override
    public void playTrack(int track) {

    }
}
