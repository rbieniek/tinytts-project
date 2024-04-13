package tinyttsproject.security;

import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import tinyttsproject.support.LocalTestConfiguration;

@Configuration
@ComponentScan(excludeFilters = @ComponentScan.Filter(type = FilterType.ANNOTATION, classes = LocalTestConfiguration.class))
@ConfigurationPropertiesScan
public class SecurityConfiguration {
}
