package com.springbook.biz.common;

import org.aspectj.lang.JoinPoint;

public class Log4jAdvice {
	public void printLogging() {
		System.out.println("[공통 로그-Log4j] 비즈니스 로직 수행 전 동작");
	}
	
	public void ListLogging(JoinPoint jp) {
		String method = jp.getSignature().getName();
		Object[] args = jp.getArgs();
		System.out.println("[List-Log4j]" + method +"() ARGS : " + args[0].toString());
	}
}
