//package com.example.Studentdemo;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.authentication.AuthenticationProvider;
//import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
//import org.springframework.security.config.Customizer;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.http.SessionCreationPolicy;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.crypto.password.NoOpPasswordEncoder;
//import org.springframework.security.web.SecurityFilterChain;
//
//@Configuration
//@EnableWebSecurity
//public class SecurityConfiguration {
//
//	@Autowired
//	private UserDetailsService userDetailsService;
//
//	@Bean
//	public SecurityFilterChain sfc(HttpSecurity hs) throws Exception {
//		return hs
//				// .csrf(customizer -> customizer.disable())
//				.authorizeHttpRequests(r -> r.anyRequest().authenticated()).httpBasic(Customizer.withDefaults())
//				.sessionManagement(s -> s.sessionCreationPolicy(SessionCreationPolicy.STATELESS)).build();
//		// .formLogin(Customizer.withDefaults())
//
//	}
//
//	@Bean
//	public AuthenticationProvider authpro() {
//		DaoAuthenticationProvider provider = new DaoAuthenticationProvider();
//		provider.setPasswordEncoder(NoOpPasswordEncoder.getInstance());
//		provider.setUserDetailsService(userDetailsService);
//
//		return provider;
//
//	}
//}
