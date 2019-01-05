package concert;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;		
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Audience {
	// Declaring a named Pointcut
	@Pointcut("execution(** concert.Performance.perform(..))")
	public void performance() {
	};

	// Around annotation this time
	@Around("performance()")
	public void watchPerformance(ProceedingJoinPoint jp) { // note ProceedingJointPoint here
		try {
			System.out.println("Audiences silencing cell phones.");
			System.out.println("Audiences taking seats.");
			jp.proceed();
			System.out.println("Clap Clap Clap!");
		} catch (Throwable e) {
			System.out.println("Audiences demanding refund.");
		}
	}
}
