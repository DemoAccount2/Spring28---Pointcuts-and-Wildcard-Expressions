package com.osgo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class LoggingAspect
{
	// @Before("execution(* get*())")									// 0 arguments
	// @Before("execution(* get*(*))")								// 1 or more arguments
	// @Before("execution(* get*(..))")								// 0 or more arguments
	@Before("allGetters()")
	public void loggingAdvice()
	{
		System.out.println("Advice run.  Get method called.");
	} // end method loggingAdvice
	
	
	// @Before("execution(* get*())")
	@Before("allGetters()")
	public void secondAdvice()
	{
		System.out.println("Second Advice executed.");
	} // end method secondAdvice
	
	
	@Pointcut("execution(* get*())")
	public void allGetters()
	{
	} // end dummy method allGetters
	
	
} // end Class LoggingAspect
