package concert;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Audience {
	@Pointcut("execution(** concert.Performance.perform(..))")
	public void performance() {};
	
	@Before("performance()")
	public void silenceCellPhones() {
		System.out.println("Audiences silencing cell phones.");
	}

	@Before("performance()")
	public void takeSeats() {
		System.out.println("Audiences taking seats.");
	}

	@AfterReturning("performance()")
	public void applause() {
		System.out.println("Clap Clap Clap!");
	}

	@AfterThrowing("performance()")
	public void demandRefund() {
		System.out.println("Audiences demaning refund.");
	}
}
