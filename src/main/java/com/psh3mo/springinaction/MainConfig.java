package com.psh3mo.springinaction;

import com.psh3mo.springinaction.chapter_1.knights.config.KnightConfig;
import com.psh3mo.springinaction.chapter_2.soundsystem.config.SoundSystemConfig;
import com.psh3mo.springinaction.chapter_3.config.BlankDiscConfig;
import com.psh3mo.springinaction.chapter_3.config.ConditionConfig;
import com.psh3mo.springinaction.chapter_3.config.DessertConfig;
import com.psh3mo.springinaction.chapter_4.config.ConcertConfig;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({KnightConfig.class, SoundSystemConfig.class, ConditionConfig.class, DessertConfig.class, BlankDiscConfig.class,
        ConcertConfig.class})
// aspect enabled in concertbeans.xml
//@EnableAspectJAutoProxy
public class MainConfig {

}
