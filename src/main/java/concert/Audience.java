package concert;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Audience {
	@Before("execution(** concert.Performance.perform(..))")
	public void silenceCellPhones() {
		System.out.println("Audiences silencing cell phones.");
	}

	@Before("execution(** concert.Performance.perform(..))")
	public void takeSeats() {
		System.out.println("Audiences taking seats.");
	}

	@AfterReturning("execution(** concert.Performance.perform(..))")
	public void applause() {
		System.out.println("Clap Clap Clap!");
	}

	@AfterThrowing("execution(** concert.Performance.perform(..))")
	public void demandRefund() {
		System.out.println("Audiences demaning refund.");
	}
}
