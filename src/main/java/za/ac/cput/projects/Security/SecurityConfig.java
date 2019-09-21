package za.ac.cput.projects.Security;

import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;



public class SecurityConfig extends WebSecurityConfigurerAdapter {
    private static final String USER_ROLE = "ArtDirector";


    @Override
    protected  void configure(AuthenticationManagerBuilder auth) throws Exception{
                        auth.inMemoryAuthentication()
                        .withUser("ArtDirector")
                        .password("{noop}kewuti")
                        .roles("ArtDirector_User");

    }

}
