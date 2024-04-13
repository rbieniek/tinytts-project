package tinyttsproject.security;

import com.vaadin.flow.spring.security.VaadinWebSecurity;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;
import tinyttsproject.views.login.LoginView;

@Configuration
@EnableWebSecurity
public class ViewSecurityConfiguration extends VaadinWebSecurity {
    @Override
    protected void configure(final HttpSecurity http) throws Exception {
        http.authorizeHttpRequests(auth ->
                auth.requestMatchers(AntPathRequestMatcher.antMatcher(HttpMethod.GET, "/images/*.png"))
                        .permitAll());
        super.configure(http);

        setLoginView(http, LoginView.class);
    }
}
