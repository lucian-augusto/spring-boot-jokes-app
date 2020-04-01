package com.lucianaugusto.jokesapp.services;

import org.springframework.stereotype.Service;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;

@Service
public class JokeServiceImpl implements JokeService {

//	Fields
	private final ChuckNorrisQuotes chuckNorrisQuotes;
	
//	Constructors
	public JokeServiceImpl(ChuckNorrisQuotes chuckNorrisQuotes) { // Constructor based Injection. 
		// We have a single property and a constructor, now we have to provide a bean to the context
		this.chuckNorrisQuotes = chuckNorrisQuotes;
	}

	@Override
	public String getJoke() {
		return chuckNorrisQuotes.getRandomQuote();
	}
}
