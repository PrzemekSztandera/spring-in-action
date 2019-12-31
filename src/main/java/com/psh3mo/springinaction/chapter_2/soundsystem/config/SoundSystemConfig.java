package com.psh3mo.springinaction.chapter_2.soundsystem.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;

@Configuration
// @ComponentScan when there are components instead of beans
//@ComponentScan(basePackages = "com.psh3mo.springinaction.chapter_2.soundsystem")
@Import({CDConfig.class, CDPlayerConfig.class})
//@ImportResource("classpath:soundsystembeans.xml")
public class SoundSystemConfig {

}
