package com.psh3mo.springinaction.knights.config;

import com.psh3mo.springinaction.knights.BraveKnight;
import com.psh3mo.springinaction.knights.Knight;
import com.psh3mo.springinaction.knights.Minstrel;
import com.psh3mo.springinaction.knights.Quest;
import com.psh3mo.springinaction.knights.SlayDragonQuest;
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
