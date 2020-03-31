package com.lucianaugusto.jokesapp.services;

import org.springframework.stereotype.Service;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;

@Service
public class JokeServiceImpl implements JokeService {

//	Fields
	private final ChuckNorrisQuotes chuckNorrisQuotes;
	
//	Constructors
	public JokeServiceImpl() {
		this.chuckNorrisQuotes = new ChuckNorrisQuotes(); // Initializing the final variable (variable that cannot be
		// changed) inside the constructor, which avoids that it being created at every request, thus reducing the overhead.
	}



	@Override
	public String getJoke() {
		return chuckNorrisQuotes.getRandomQuote();
	}
}
