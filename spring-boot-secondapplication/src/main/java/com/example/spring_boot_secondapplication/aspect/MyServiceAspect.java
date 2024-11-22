package com.example.spring_boot_secondapplication.aspect;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;
@Aspect
@Component
public class MyServiceAspect {

    // Define a Pointcut for all methods in MyService
    @Pointcut("execution(* com.example.demo.service.MyService.*(..))")
    public void serviceMethods() {}

    // Advice to run before the method execution
    @Before("serviceMethods()")
    public void logBefore() {
        System.out.println("Before method execution...");
    }

    // Advice to run after the method execution
    @AfterReturning(pointcut = "serviceMethods()", returning = "result")
    public void logAfterReturning(Object result) {
        System.out.println("Method executed, result: " + result);
    }
}


