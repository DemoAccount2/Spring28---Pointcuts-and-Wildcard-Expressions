package com.osgo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class LoggingAspect
{
	// @Before("execution(* get*())")								// 0 arguments
	// @Before("execution(* get*(*))")								// 1 or more arguments
	@Before("execution(* get*(..))")								// 0 or more arguments
	public void LoggingAdvice()
	{
		System.out.println("Advice run.  Get method called.");
	} // end method LoggingAdvice
	
} // end Class LoggingAspect
