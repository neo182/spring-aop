package concert;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Audience {
	// Note the args(quality) and how it is used in the following code
	@Pointcut("execution(** concert.Performance.perform(String)) && args(quality)")
	public void performance(String quality) {
	};

	@AfterReturning("performance(quality)")
	public void evaluationOfPerformance(String quality) { // note the param quality here
		System.out.println("The audiences saw a " + quality + " performance.");
	}
}
