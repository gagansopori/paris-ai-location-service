package ai.paris.location.service.application;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("ai.paris.location")
public class LocationTriggerApplication {
	
	protected static final Logger LOGGER = LoggerFactory.getLogger(LocationTriggerApplication.class);
	private static ApplicationContext context;
	
	public static void main(String[] args) {
		
		try {
			context = SpringApplication.run(LocationTriggerApplication.class, args);
			LOGGER.info("Initiating Launch Sequence");
//			((ConfigurableApplicationContext) context).close();
		}catch (Exception e) {
			LOGGER.error("Launch Failed, Terminating Application");
		}
		
	}
}