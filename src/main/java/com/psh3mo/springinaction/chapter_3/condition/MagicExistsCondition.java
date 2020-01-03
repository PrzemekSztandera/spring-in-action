package com.psh3mo.springinaction.chapter_3.condition;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.annotation.MergedAnnotation;
import org.springframework.core.env.Environment;
import org.springframework.core.type.AnnotatedTypeMetadata;

public class MagicExistsCondition implements Condition {

    @Override
    public boolean matches(ConditionContext conditionContext, AnnotatedTypeMetadata annotatedTypeMetadata) {
        Environment env = conditionContext.getEnvironment();
        System.out.println(env.toString());
        System.out.println("-----------------");
        for(MergedAnnotation mergedAnnotation : annotatedTypeMetadata.getAnnotations()) {
            System.out.println(mergedAnnotation.toString());
        }
//        return env.containsProperty("magic");
        return true;
    }
}
