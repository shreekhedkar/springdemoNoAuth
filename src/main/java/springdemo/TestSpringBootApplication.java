package springdemo;

import java.util.HashMap;
import java.util.Map;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TestSpringBootApplication {

	public static void main(String[] args) {

		Map<String, Object> prop = new HashMap<String, Object>();
		prop.put("server.port", "8085");
		SpringApplication app = new SpringApplication(TestSpringBootApplication.class);
		app.setDefaultProperties(prop);
		app.run(args);
	}
}
