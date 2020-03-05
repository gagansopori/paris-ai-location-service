package ai.paris.location.service.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class UserLocationService implements CommandLineRunner {
	
	@Autowired
	UserLocationServiceImpl userLocationServiceImpl;
	
	protected static final Logger LOGGER = LoggerFactory.getLogger(UserLocationService.class);
	
	
	@Override
	public void run(String... args) {
		
		LOGGER.info("Firing up Location Service");
		userLocationServiceImpl.findUser();
	}

}
