package aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
@Aspect
public class MyAdvice {
    @Pointcut("execution(void dao.BookDao.update(..))")
    private void pt() {
    }

    public void before(JoinPoint jp) {
        Object[] args = jp.getArgs();
        System.out.println(Arrays.toString(args));

        System.out.println("before advice ...");
    }

    public void after() {
        System.out.println("after advice ...");
    }

    public void around() {
        System.out.println("around before advice ...");
        System.out.println("around after advice ...");
    }

    public void afterReturning() {
        System.out.println("afterReturning advice ...");
    }

    public void afterThrowing() {
        System.out.println("afterThrowing advice ...");
    }
}