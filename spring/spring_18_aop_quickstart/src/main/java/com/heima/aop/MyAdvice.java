package com.heima.aop;

import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.ProceedingJoinPoint;
import org.springframework.stereotype.Component;


@Component
@Aspect
public class MyAdvice {

    // 切入点
    @Pointcut("execution(* com.heima.dao.BookDao.save(..))")
    private void save_pt() {
    }

//    @Pointcut("execution(* com.heima.dao.BookDao.update(..))")
//    private void pt() {
//    }


//    @Before("pt()") // 绑定
//    public void method(){  // 共性功能
//        System.out.println(System.currentTimeMillis());
//    }

//    @Around("pt()")
//    public void around(ProceedingJoinPoint pjp) throws Throwable {
//        System.out.println("around before advice");
//        // 表示对原始操作的调用
//        pjp.proceed();
//        System.out.println("around after advice");
//    }

    @Around("save_pt()")
    public Object around(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("around before advice");
        // 表示对原始操作的调用
        Object res = pjp.proceed();
        System.out.println("around after advice");
        return res;
    }
}
