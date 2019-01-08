package concert;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.DeclareParents;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class EncorableIntroducer {
	@DeclareParents(value = "concert.Performance+", defaultImpl = DefaultEncorable.class)
	public static Encorable encorable;

}
