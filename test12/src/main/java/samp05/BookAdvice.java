package samp05;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class BookAdvice {
	@Pointcut("execution(* getBook(String))")
	private void helloPointcut() {}
	
	@Before("helloPointcut()")
	private void before() {
		System.out.println("before");
	}
	
	@Around("helloPointcut()")
	private Object around(ProceedingJoinPoint pjp ) throws Throwable {
		System.out.println("작업 전 around");
		Object obj = pjp.proceed();
		System.out.println("작업 후 around");
		return obj;
	}
	@After("helloPointcut()")
	private void after() {
		System.out.println("after");
	}
	@AfterReturning(value = "helloPointcut()", returning = "book") 
	public void afterReturn(Book book) {
		System.out.println("after_return : " + book);
	}
	
	@AfterThrowing(pointcut = "helloPointcut()", throwing = "ex")
	public void afterThrow(Throwable ex) {	
		System.out.println(ex.getMessage());
	}
}
