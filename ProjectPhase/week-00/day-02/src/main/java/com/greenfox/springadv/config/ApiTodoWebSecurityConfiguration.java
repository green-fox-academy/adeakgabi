package com.greenfox.springadv.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class ApiTodoWebSecurityConfiguration extends WebSecurityConfigurerAdapter {

    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
        auth
                .inMemoryAuthentication()
                .withUser("user")
                .password("password")
                .roles("USER")
                .and()
                .withUser("admin")
                .password("password")
                .roles("ADMIN", "USER");

    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                .authorizeRequests()   //???
                .antMatchers("/register").permitAll()
                .antMatchers("/admin", "/list").hasRole("ADMIN")
                .anyRequest().authenticated()
                .and()
                .csrf().disable()     //cross site request forgery  --> ha szeretném h a PostMapping endpoint is működjön akkor ezt hozzá kell adni
                .formLogin()
                .permitAll();
    }
}
