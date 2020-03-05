package ai.paris.location.service.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import ai.paris.location.service.model.UserLocationResponse;


@Component
public class UserLocationServiceImpl {
	
	@Autowired
	private RestTemplate restTemplate;
	
	@Value("${LocationURL}")
	private String url;
	
	
	protected static final Logger LOGGER = LoggerFactory.getLogger(UserLocationServiceImpl.class);
	
	public UserLocationResponse findUser() {
		
		LOGGER.info("Finding User Location");
		UserLocationResponse ulm = restTemplate.getForObject(url, UserLocationResponse.class);
		System.out.println(ulm.toString());
		return ulm;
	}

}
