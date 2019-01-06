package concert;

import org.springframework.stereotype.Component;

@Component
public class Performance {
	public void perform(String quality) {
		System.out.println("An artist gave a " + quality + " performance!");
	}
	
}
