package tinyttsproject.persistence;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import tinyttsproject.persistence.rdbms.PersistenceRdbmsConfiguration;

@Configuration
@Import({PersistenceRdbmsConfiguration.class})
public class PersistenceConfiguration {
}
