package com.app.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter
{
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.inMemoryAuthentication()
                .withUser("ahmed").password("{noop}123").roles("ADMIN").and()
                .withUser("habiba").password("{noop}123").roles("SYSTEM");
    }
    @Override
    protected void configure(HttpSecurity http)throws Exception{
        http
                .authorizeRequests()
                .antMatchers("/adminPage").hasRole("ADMIN")
                .antMatchers("/systemPage").hasRole("SYSTEM")
                .and().formLogin().defaultSuccessUrl("/",true).permitAll();
    }
}


