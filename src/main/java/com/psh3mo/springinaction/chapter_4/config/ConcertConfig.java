package com.psh3mo.springinaction.chapter_4.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;

@ComponentScan(basePackages = "com.psh3mo.springinaction.chapter_4")
@ImportResource("classpath:concertbeans.xml")
public class ConcertConfig {

}
