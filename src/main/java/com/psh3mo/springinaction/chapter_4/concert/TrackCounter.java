package com.psh3mo.springinaction.chapter_4.concert;

import java.util.HashMap;
import java.util.Map;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

//@Aspect
@Component
public class TrackCounter {

    private Map<Integer, Integer> trackCounts = new HashMap<>();

//    @Pointcut("execution(* com.psh3mo.springinaction.chapter_2.soundsystem.BlankDisc.playTrack(int)) && args(trackNum)")
//    public void trackPlayed(int trackNum) {}
//
//    @Before(value = "trackPlayed(trackNumber)", argNames = "trackNumber")
    // advice method
    public void countTrack(int trackNumber) {
        int currentCount = getPlayCount(trackNumber);
        trackCounts.put(trackNumber, currentCount + 1);
    }

    public int getPlayCount(int trackNumber) {
        return trackCounts.getOrDefault(trackNumber, 0);
    }
}
