package com.WebPageProject1.UserRegistration_Login.Aop;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
@Aspect
@Slf4j
public class GenerateAop {
@Pointcut("execution(* com.WebPageProject1.UserRegistration_Login.Controller.*.*(..))")
    public void generateAop(){

    }
    @Before("")
 public void generateBefore(){
log.info("before method");
 }

}
