package com.example.movie;

import java.util.*;


import org.springframework.web.bind.annotation.*;

import com.example.movie.MovieService;

// Write your code here
@RestController
public class MovieController {
    MovieService movieService = new MovieService();

    @GetMapping("/movies")
    public ArrayList<Movie> getMovies() {
        return movieService.getMovies();
    }

    @GetMapping("/movies/{movieId}")
    public Movie getMovieById(@PathVariable("movieId") int movieId) {
        return movieService.getMovieById(movieId);
    }

    @PostMapping("/movies")
    public Movie addMovie(@RequestBody Movie movie) {
        return movieService.addMovie(movie);
    }

    @PutMapping("/movies/{movieId}")
    public Movie updatedMovie(@PathVariable("movieId") int movieId, @RequestBody Movie movie) {
        return movieService.updatedMovie(movieId, movie);
    }

    @DeleteMapping("/movies/{movieId}")
    public void deleteMovie(@PathVariable("movieId") int movieId) {
        movieService.deleteMovie(movieId);
    }
}
