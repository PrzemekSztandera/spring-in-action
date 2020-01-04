package com.psh3mo.springinaction.chapter_4.concert;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

//@Aspect
@Component
public class Audience {

    // perform() method here is advised method
//    @Pointcut("execution(* com.psh3mo.springinaction.chapter_4.concert.Performance.perform(..))")
//    public void performance() {}


//    @Before("execution(* com.psh3mo.springinaction.chapter_4.concert.Performance.perform(..))")
    /*@Before("performance()")
    public void silenceCellPhone() {
        System.out.println("Silencing cell phones");
    }

    @Before("performance()")
    public void takeSeat() {
        System.out.println("Taking seats");
    }

    @AfterReturning("performance()")
    public void applause() {
        System.out.println("CLAP CLAP CLAP");
    }

    @AfterThrowing("performance()")
    public void demandRefund() {
        System.out.println("Demanding refund");
    }*/

    public void silenceCellPhone() {
        System.out.println("Silencing cell phones");
    }

    public void takeSeat() {
        System.out.println("Taking seats");
    }

    public void applause() {
        System.out.println("CLAP CLAP CLAP");
    }

    public void demandRefund() {
        System.out.println("Demanding refund");
    }

//    @Around("performance()")
//    // this is an advice method
//    public Object watchPerformance(ProceedingJoinPoint proceedingJoinPoint) {
//        try {
//            System.out.println("Silencing cell phones");
//            System.out.println("Taking seats");
//            proceedingJoinPoint.proceed();
//            System.out.println("CLAP CLAP CLAP");
//            throw new Exception();
//        } catch (Throwable e) {
//            System.out.println("Demanding a refund");
//        }
//        return new Object();
//    }

}
