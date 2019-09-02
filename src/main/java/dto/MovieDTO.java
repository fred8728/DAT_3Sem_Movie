/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dto;

import entities.Movie;

/**
 *
 * @author fskn
 */
public class MovieDTO {
    private int movieID;
    private String movieName;
    private int MovieRating;
    private int year;
    Movie movie = new Movie();

    public MovieDTO() {
    }

    public MovieDTO(Movie movie) {
        this.movieID = movie.getId();
        this.movieName = movie.getName();
        this.MovieRating = movie.getRating();
        this.year = movie.getYear();
    }

    public int getMovieID() {
        return movieID;
    }

    public void setMovieID(int movieID) {
        this.movieID = movieID;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public int getMovieRating() {
        return MovieRating;
    }

    public void setMovieRating(int MovieRating) {
        this.MovieRating = MovieRating;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }
    
    
}
