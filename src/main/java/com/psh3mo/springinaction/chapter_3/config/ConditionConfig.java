package com.psh3mo.springinaction.chapter_3.config;

import com.psh3mo.springinaction.chapter_3.condition.MagicBean;
import com.psh3mo.springinaction.chapter_3.condition.MagicExistsCondition;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.Conditional;

//@Configuration
public class ConditionConfig {

    @Bean
    @Conditional(MagicExistsCondition.class)
    public MagicBean magicBean() {
        return new MagicBean();
    }

}
