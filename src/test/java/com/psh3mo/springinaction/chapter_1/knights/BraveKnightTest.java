package com.psh3mo.springinaction.chapter_1.knights;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import org.junit.Test;

public class BraveKnightTest {

    Minstrel minstrel = new Minstrel();

    @Test
    public void knightShouldEmbarkOnQuest() {
        Quest mockQuest = mock(Quest.class);
        BraveKnight knight = new BraveKnight(mockQuest, minstrel);
        knight.embarkOnQuest();
        verify(mockQuest, times(1)).embark();
    }
}