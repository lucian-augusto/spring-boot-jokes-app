package com.lucianaugusto.jokesapp.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.lucianaugusto.jokesapp.services.JokeService;

@Controller
public class JokeController {

	private JokeService jokeService;

//	Constructor
	@Autowired // Annotating the dependency
	public JokeController(JokeService jokeService) {
		this.jokeService = jokeService;
	}
	
	@RequestMapping({"/", ""}) // Mapping the request route
	public String showJoke(Model model) {
		model.addAttribute("joke", jokeService.getJoke()); // Appending model with the joke property
		
		return "chucknorris"; // return the view name for the Thymeleaf template
	}
}
