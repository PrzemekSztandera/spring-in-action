package com.psh3mo.springinaction;

import com.psh3mo.springinaction.chapter_1.knights.Knight;
import com.psh3mo.springinaction.chapter_3.condition.MagicBean;
import com.psh3mo.springinaction.chapter_3.dessert.MakeDessert;
import com.psh3mo.springinaction.chapter_3.propertytest.BlankDisk;
import com.psh3mo.springinaction.chapter_4.concert.ClassicPerformance;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringInActionApplication implements ApplicationRunner {

    private MakeDessert makeDessert;
    private Knight knight;
    private MagicBean magicBean;
    private BlankDisk blankDisk;
    private ApplicationContext applicationContext;
    private ClassicPerformance classicPerformance;


    public static void main(String[] args) {

        SpringApplication.run(SpringInActionApplication.class, args);

    }

    @Override
    public void run(ApplicationArguments args) throws Exception {

        System.out.println("\n--------------------------------------");
        // Context from java config class
//        ApplicationContext applicationContext2 = new AnnotationConfigApplicationContext(KnightConfig.class, MagicBean.class,
//                MakeDessert.class, IceCream.class);
//        Knight knight = applicationContext.getBean(Knight.class);
//        MagicBean magicBean = applicationContext.getBean(MagicBean.class);

//        applicationContext2.getBean(MakeDessert.class).runDessert();
        knight.embarkOnQuest();
        magicBean.printSomething();
        makeDessert.runDessert();
        System.out.println(blankDisk.toString());
        classicPerformance.perform();

        // Context from XML file
        /*ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("knightsbeans.xml");
        Knight knight = context.getBean(Knight.class);
        knight.embarkOnQuest();
        context.close();*/
        System.out.println("--------------------------------------");
    }

    @Autowired
    public void setMakeDessert(MakeDessert makeDessert) {
        this.makeDessert = makeDessert;
    }
    @Autowired
    public void setKnight(Knight knight) {
        this.knight = knight;
    }
    @Autowired
    public void setMagicBean(MagicBean magicBean) {
        this.magicBean = magicBean;
    }
    @Autowired
    public void setApplicationContext(ApplicationContext applicationContext) {
        this.applicationContext = applicationContext;
    }
    @Autowired
    public void setBlankDisk(BlankDisk blankDisk) {
        this.blankDisk = blankDisk;
    }
    @Autowired
    public void setClassicPerformance(ClassicPerformance classicPerformance) {
        this.classicPerformance = classicPerformance;
    }
}
