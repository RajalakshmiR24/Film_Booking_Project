package com.bus.service;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.bus.beans.MovieDetails;

@Repository
public interface MovieRepo extends JpaRepository<MovieDetails, Long> {
	List<Movie> findByMovieName(String movieName);


    @Query("SELECT m FROM Movie m WHERE m.movie_id = :movie_id")
    Movie findByMovieId(@Param("movie_id") Long movie_id);


	<S extends MovieDetails> S save(Movie movie);


	


}
