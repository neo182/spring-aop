package concert;

import org.springframework.stereotype.Component;

@Component
public class Performance {
	public void perform() {
		System.out.println("An artist giving his performance!");
	}
}
