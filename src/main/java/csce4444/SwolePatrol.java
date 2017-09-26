package csce4444;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

// This class acts as the main web controller. When a web request comes in, it is handled by the appropriate
// RequestMapping method. Starts on port 8080 by default.

@Controller
@SpringBootApplication
public class SwolePatrol {

	// These are the components necessary for the application to function
	
	@Autowired private UNTDataCollector dataCollector;
	
	// These are the request mappings for handling web requests. 
	
	@RequestMapping("/")
	public String index(Map<String, Object> model) {
		// replace variables in the html file
		model.put("swipes", ""+(Math.random()*100));
		return "index"; // this is the name of the html file to return
	}

	/**
	 * This method is what is run when the application starts. Its purpose is to run
	 * this class as a spring application.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// Set this class as the Spring Controller
		SpringApplication.run(SwolePatrol.class, args);
	}

}
