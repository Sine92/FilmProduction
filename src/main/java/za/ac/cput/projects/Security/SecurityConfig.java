package za.ac.cput.projects.Security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;


@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter {
    private static final String USER_ROLE = "ArtDirector";


    @Override
    protected  void configure(AuthenticationManagerBuilder auth) throws Exception{
                        auth.inMemoryAuthentication()
                        .withUser("user")
                        .password(encoder().encode("kewuti"))
                        .roles("ArtDirector_User");

    }
    @Override
    protected void configure(HttpSecurity http) throws Exception {
              http.httpBasic()
                      .and()
                      .authorizeRequests()
                      .antMatchers(HttpMethod.GET,"/artDepartment/**/create").hasRole(USER_ROLE)
                      .and()
                      .csrf().disable()
                      .formLogin().disable();


    }

    @Bean
    public PasswordEncoder encoder() {
        return new BCryptPasswordEncoder();
    }

}
