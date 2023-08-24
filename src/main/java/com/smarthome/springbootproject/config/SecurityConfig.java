package com.smarthome.springbootproject.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configurers.HttpBasicConfigurer;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.context.annotation.Bean;

@Configuration
@EnableWebSecurity
public class SecurityConfig {
	
	@Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http
            .authorizeHttpRequests((authz) -> authz
            	.requestMatchers("/public/**").permitAll() // Public paths
                .requestMatchers("/admin/**").hasRole("ADMIN") //Paths restricted to users with ADMIN roles
                .anyRequest().authenticated()
            )
            
            .formLogin(formLogin -> 
            formLogin
                .loginPage("/custom-login") // Specifies the URL of the custom login page
                .defaultSuccessUrl("/dashboard") // Redirect to "/dash-board" after successful login
        )
            
            .logout(logout ->
            logout
                .permitAll() // Allow all users to perform logout
        );
        
            
        return http.build();
    }
	
}
