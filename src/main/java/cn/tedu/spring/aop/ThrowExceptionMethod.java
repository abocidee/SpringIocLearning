package cn.tedu.spring.aop;

import org.springframework.aop.ThrowsAdvice;

public class ThrowExceptionMethod implements ThrowsAdvice{
	public void afterThrowing(IllegalArgumentException e) throws Throwable {
		System.out.println("HijackThrowException : Throw exception hijacked!");
	}
}
