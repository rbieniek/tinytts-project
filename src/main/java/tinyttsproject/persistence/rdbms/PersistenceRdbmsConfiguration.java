package tinyttsproject.persistence.rdbms;

import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import tinyttsproject.support.LocalTestConfiguration;

@Configuration
@ComponentScan(excludeFilters = @ComponentScan.Filter(type = FilterType.ANNOTATION, classes = LocalTestConfiguration.class))
@ConfigurationPropertiesScan
@EnableJpaRepositories
public class PersistenceRdbmsConfiguration {
}
