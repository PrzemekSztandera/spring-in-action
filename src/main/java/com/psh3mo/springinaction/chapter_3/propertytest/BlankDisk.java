package com.psh3mo.springinaction.chapter_3.propertytest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("classpath:app.properties")
public class BlankDisk {
    private String title;
    private String artist;

//    Environment environment;
//
//    @Autowired
//    public BlankDisk(Environment environment) {
//        this.title = environment.getProperty("disc.title");
//        this.artist = environment.getProperty("disc.artist");
//        this.environment = environment;
//    }

    @Autowired
    public BlankDisk(@Value("${disc.title}") String title, @Value("${disc.artist}") String artist) {
        this.title = title;
        this.artist = artist;
    }

//    @Autowired
//    public BlankDisk(@Value("#{app['disc.title']}") String title, @Value("#{app['disc.artist']}") String artist) {
//        this.title = title;
//        this.artist = artist;
//    }

    @Override
    public String toString() {
        return "BlankDisk{" +
                "title='" + title + '\'' +
                ", artist='" + artist + '\'' +
                '}';
    }
}
