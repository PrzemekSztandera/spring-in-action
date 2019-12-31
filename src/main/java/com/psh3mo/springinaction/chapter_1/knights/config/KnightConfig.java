package com.psh3mo.springinaction.chapter_1.knights.config;

import com.psh3mo.springinaction.chapter_1.knights.BraveKnight;
import com.psh3mo.springinaction.chapter_1.knights.Knight;
import com.psh3mo.springinaction.chapter_1.knights.Minstrel;
import com.psh3mo.springinaction.chapter_1.knights.Quest;
import com.psh3mo.springinaction.chapter_1.knights.SlayDragonQuest;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class KnightConfig {

    @Bean
    public Knight knight() {
        return new BraveKnight(quest(), minstrel());
    }

    @Bean
    public Quest quest() {
        return new SlayDragonQuest();
//        return new SlayDragonQuest(System.out);
    }

    @Bean
    public Minstrel minstrel() {
        return new Minstrel();
    }

}
