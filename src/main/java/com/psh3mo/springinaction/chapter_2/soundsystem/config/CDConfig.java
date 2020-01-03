package com.psh3mo.springinaction.chapter_2.soundsystem.config;

import com.psh3mo.springinaction.chapter_2.soundsystem.CompactDisc;
import com.psh3mo.springinaction.chapter_2.soundsystem.SgtPeppers;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//@Configuration
public class CDConfig {

    @Bean
    public CompactDisc compactDisc() {
        return new SgtPeppers();
    }
}
