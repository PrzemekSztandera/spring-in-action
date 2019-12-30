package com.psh3mo.springinaction;

import com.psh3mo.springinaction.knights.Knight;
import com.psh3mo.springinaction.knights.config.KnightConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class SpringInActionApplication implements ApplicationRunner {

    /*@Autowired
    ApplicationContext applicationContext;*/

    public static void main(String[] args) {

        SpringApplication.run(SpringInActionApplication.class, args);

    }

    @Override
    public void run(ApplicationArguments args) throws Exception {

        System.out.println("\n--------------------------------------");
        // Context from java config class
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(KnightConfig.class);
        Knight knight = applicationContext.getBean(Knight.class);
        knight.embarkOnQuest();

        // Context from XML file
        /*ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("knightsbeans.xml");
        Knight knight = context.getBean(Knight.class);
        knight.embarkOnQuest();
        context.close();*/
        System.out.println("--------------------------------------");
    }
}
