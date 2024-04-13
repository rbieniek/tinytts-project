package tinyttsproject.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;
import tinyttsproject.persistence.PersistenceConfiguration;
import tinyttsproject.security.SecurityConfiguration;

@SpringBootApplication
@Import({PersistenceConfiguration.class, SecurityConfiguration.class})
public class TinyttsProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(TinyttsProjectApplication.class, args);
	}

}

