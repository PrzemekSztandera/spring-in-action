package com.psh3mo.springinaction.chapter_2.soundsystem.config;

import com.psh3mo.springinaction.chapter_2.soundsystem.BlankDisc;
import com.psh3mo.springinaction.chapter_2.soundsystem.CompactDisc;
import com.psh3mo.springinaction.chapter_2.soundsystem.SgtPeppers;
import java.util.ArrayList;
import java.util.List;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

//@Configuration
public class CDConfig {

    @Bean("sgtPeppers")
    @Primary
    public CompactDisc compactDisc() {
        return new SgtPeppers();
    }

    @Bean("blankDisc")
    public CompactDisc blankDisc() {
        BlankDisc blankDisc = new BlankDisc();
        blankDisc.setTitle("Sgt. Pepper's Lonely Hearts Club Band");
        blankDisc.setArtist("The Beatles");
        List<String> tracks = new ArrayList<>();
        tracks.add("Sgt. Pepper's Lonely Hearts Club Band");
        tracks.add("With a Little Help from My Friends");
        tracks.add("Lucy in the Sky with Diamonds");
        tracks.add("Getting Better");
        tracks.add("Fixing a Hole");
        blankDisc.setTracks(tracks);
        return blankDisc;
    }

}
