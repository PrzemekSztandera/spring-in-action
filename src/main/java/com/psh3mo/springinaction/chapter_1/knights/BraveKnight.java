package com.psh3mo.springinaction.chapter_1.knights;

public class BraveKnight implements Knight {

    private Quest quest;
    private Minstrel minstrel;

    // Constructor injection
    public BraveKnight(Quest quest) {
        this.quest = quest;
    }

    public BraveKnight(Quest quest, Minstrel minstrel) {
        this.quest = quest;
        this.minstrel = minstrel;
    }

    public void embarkOnQuest() {
        minstrel.singBeforeQuest();
        quest.embark();
        minstrel.singAfterQuest();
    }
}
