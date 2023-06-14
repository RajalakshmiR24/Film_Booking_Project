package com.bus.service;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;

import com.bus.beans.MovieDetails;

@Entity
public class Movie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long movie_id;

    @Lob
    private byte[] image;

    @ManyToOne
    private MovieDetails movieDetails;

    private String movieName;

    public Movie() {
    }

    public Movie(byte[] image, MovieDetails movieDetails, String movieName) {
        this.image = image;
        this.movieDetails = movieDetails;
        this.movieName = movieName;
    }

    public Long getMovieId() {
        return movie_id;
    }

    public void setMovieId(Long movieId) {
        this.movie_id = movieId;
    }

    public byte[] getImage() {
        return image;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }

    public MovieDetails getMovieDetails() {
        return movieDetails;
    }

    public void setMovieDetails(MovieDetails movieDetails) {
        this.movieDetails = movieDetails;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

}
