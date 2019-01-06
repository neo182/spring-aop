package concert;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ConcertMain {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext context = new AnnotationConfigApplicationContext(ConcertConfig.class);
		Performance performance = (Performance) context.getBean("performance");
		performance.perform("Good");
	}

}
