package com.lucianaugusto.jokesapp.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;

@Configuration
public class ChuckConfiguration {

	@Bean // Telling the Spring Framework that we want it as a bean
	// Adding the property from the JokeServiceIpml
	public ChuckNorrisQuotes chuckNorrisQuotes() { // Only returns a new instance of ChuckNorrisQuotes
		return new ChuckNorrisQuotes();
	}
}
