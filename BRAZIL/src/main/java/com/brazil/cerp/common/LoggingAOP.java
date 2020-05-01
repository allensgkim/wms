package com.brazil.cerp.common;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;


public class LoggingAOP {
	Logger logger = LoggerFactory.getLogger(LoggingAOP.class);
	
	@Around("execution(* com.brazil.cerp.mapper.*(..)")
	public Object logging(ProceedingJoinPoint pjp) throws Throwable {
		logger.info("start - " + pjp.getSignature().getDeclaringTypeName() + " / " + pjp.getSignature().getName());
		Object result = pjp.proceed();
		logger.info("finished - " + pjp.getSignature().getDeclaringTypeName() + " / " + pjp.getSignature().getName());

		return result;
	}
	
	
}
