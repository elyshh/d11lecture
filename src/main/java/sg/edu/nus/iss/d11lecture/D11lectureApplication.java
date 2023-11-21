package sg.edu.nus.iss.d11lecture;

import java.util.Collections;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.DefaultApplicationArguments;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.filter.CommonsRequestLoggingFilter;

@SpringBootApplication
public class D11lectureApplication {

	// References:
	// ./mvnw spring-boot:run -Dspring-boot.run.arguments="--port=4000" -> run multiple instances on different ports
	// ./mvnw spring-boot:run -Dspring-boot.run.arguments="--port=5050"

	public static void main(String[] args) {
		// SpringApplication.run(D11lectureApplication.class, args);

		SpringApplication app = new SpringApplication(D11lectureApplication.class); // This statement alone will not run
		
		// If args is not passed in, the default port will be used
		String port="8080"; // default port
		ApplicationArguments argOptions = new DefaultApplicationArguments(args);

		if (argOptions.containsOption("port")) {
			port = argOptions.getOptionValues("port").get(0);
		}

		app.setDefaultProperties(Collections.singletonMap("server.port", port)); // Replace server.port with the number keyed in in port
		app.run(args); // Application will run

		System.out.println("My first spring-boot application started...");

	}

		@Bean
		public CommonsRequestLoggingFilter log() {
			CommonsRequestLoggingFilter logger = new CommonsRequestLoggingFilter();
			logger.setIncludeClientInfo(true);
			logger.setIncludeQueryString(true);
			return logger;
		}
		
}
