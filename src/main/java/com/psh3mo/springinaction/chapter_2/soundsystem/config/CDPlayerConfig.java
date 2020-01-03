package com.psh3mo.springinaction.chapter_2.soundsystem.config;

import com.psh3mo.springinaction.chapter_2.soundsystem.CDPlayer;
import com.psh3mo.springinaction.chapter_2.soundsystem.CompactDisc;
import com.psh3mo.springinaction.chapter_2.soundsystem.MediaPlayer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//@Configuration
public class CDPlayerConfig {

    @Bean
    public MediaPlayer mediaPlayer(CompactDisc cd) {
        return new CDPlayer(cd);
    }
}
