package com.demowebapp.etickets.model;

import java.time.LocalDate;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor

public class MoviesModel {
	private Long id;
	private String name;
	private String description;
	private float price;
	private String imageURL;
	private LocalDate startDate;
	private LocalDate endDate;
	private long movieCategory;
	private long cinemaId;
	private long producerId;
	
	
	

	

}
