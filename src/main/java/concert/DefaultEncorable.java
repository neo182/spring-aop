package concert;

import org.springframework.stereotype.Component;

@Component
public class DefaultEncorable implements Encorable {

	public void performance() {
		System.out.println("The encorable performance");

	}

}
