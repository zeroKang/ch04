package org.zerock.ch04.aop;

import lombok.extern.log4j.Log4j2;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Log4j2
public class LogAdvice {

    @Before("execution(* org.zerock.ch04.service.*.*(..))")
    public void printLog(JoinPoint joinPoint){

        log.info("print log...................");
        //파라미터의 목록을 구함
        Object[] params = joinPoint.getArgs();

        log.info("params: " + params);

        //스프링 AOP는 method의 실행
        String kind = joinPoint.getKind();

        log.info("kind: " + kind);

        //AOP가 적용된 메소드의 정보
        Signature signature = joinPoint.getSignature();

        log.info("signature: " + signature);


    }
}
