package main;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import models.Movie;

@RestController
public class MovieController {
	
	@GetMapping("/Movie")
	public Movie getMovies() {
		Movie  x = new Movie(1, "Die Hard", "Action", "5");		
		return x;
	}
}