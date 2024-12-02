package com.projeto_final_backEnd.com.configs;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@EnableWebSecurity
@Configuration
public class SecurityConfigurations {
	
	@Bean
	protected SecurityFilterChain filterChain(HttpSecurity http) throws Exception{
		http
		.csrf(csrf -> csrf.disable())
		.authorizeHttpRequests((auth) -> auth
				.requestMatchers(HttpMethod.GET, "/usuario").hasAuthority("COMUM")
				.requestMatchers(HttpMethod.GET, "/anamnese").hasAuthority("COMUM")
				.requestMatchers(HttpMethod.GET, "/cliente").hasAuthority("COMUM")
				.requestMatchers(HttpMethod.GET, "/habitostreino").hasAuthority("COMUM")
				.requestMatchers(HttpMethod.GET, "/questionario").hasAuthority("COMUM")
				.requestMatchers(HttpMethod.GET, "/questionario/todos-questionarios").hasAuthority("COMUM")
				.requestMatchers(HttpMethod.POST, "/usuario").hasAuthority("ADMIN")
				.requestMatchers(HttpMethod.POST, "/anamnese").hasAuthority("ADMIN")
				.requestMatchers(HttpMethod.POST, "/cliente").hasAuthority("ADMIN")
				.requestMatchers(HttpMethod.POST, "/habitostreino").hasAuthority("ADMIN")
				.requestMatchers(HttpMethod.POST, "/questionario").hasAuthority("ADMIN")
				.requestMatchers(HttpMethod.PUT, "/anamnese").hasAuthority("ADMIN")
				.requestMatchers(HttpMethod.PUT, "/cliente").hasAuthority("ADMIN")
				.requestMatchers(HttpMethod.PUT, "/habitostreino").hasAuthority("ADMIN")
				.requestMatchers(HttpMethod.DELETE, "/anamnese").hasAuthority("ADMIN")
				.requestMatchers(HttpMethod.DELETE, "/cliente").hasAuthority("ADMIN")
				.requestMatchers(HttpMethod.DELETE, "/habitostreino").hasAuthority("ADMIN")
				.anyRequest().authenticated()
				).httpBasic(Customizer.withDefaults());
		return http.build();
	}
	
	@Bean
	protected AuthenticationManager authenticationManager(AuthenticationConfiguration authenticationConfiguration) throws Exception{
		return authenticationConfiguration.getAuthenticationManager();
	}
	
	@Bean
	protected PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}
	
	

}
