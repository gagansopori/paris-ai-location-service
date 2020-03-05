package ai.paris.location.service.configuration;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

import ai.paris.location.service.service.UserLocationServiceImpl;

@Configuration
public class UserLocationConfiguration {
	
	protected static final Logger LOGGER = LoggerFactory.getLogger(UserLocationServiceImpl.class);
	
	@Bean
	public RestTemplate restTemplate(RestTemplateBuilder builder) {
		LOGGER.info("Bean Created");
		return builder.build();
	}	

}
