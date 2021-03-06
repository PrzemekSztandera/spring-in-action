package com.psh3mo.springinaction.chapter_1.knights;

public class DamselRescuingKnight implements Knight {

    private RescueDamselQuest quest;

    // Tightly coupled
    public DamselRescuingKnight() {
        this.quest = new RescueDamselQuest();
    }

    public void embarkOnQuest() {
        quest.embark();
    }
}
