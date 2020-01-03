package com.psh3mo.springinaction.chapter_3.dessert;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class MakeDessert {

    private Dessert dessert;

    @Autowired
//    @Qualifier("cake")
    @Cold
    public void setDessert(Dessert dessert) {
        this.dessert = dessert;
    }

    public void runDessert() {
        dessert.makeDessert();
    }
}
