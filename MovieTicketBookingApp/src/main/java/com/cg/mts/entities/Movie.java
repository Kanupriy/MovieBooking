package com.cg.mts.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
@Entity
public class Movie {
	@Id
    @GeneratedValue 
    private long studentId;
  private int movieId;
	private String movieName;
	private String movieGenre;
	private String movieHours;
	private String movieLanguage;
	private String movieDescription;
	
	
}
