/**
 *
 */
package com.demowebapp.etickets.model;

import java.time.LocalDate;
import java.util.List;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author tuhindeyit
 * @since Dec 5, 2023
 */
@Getter
@Setter
@NoArgsConstructor

public class MoviesCustomModel {
	private Long id;
	private String name;
	private String description;
	private float price;
	private String imageURL;
	private LocalDate startDate;
	private LocalDate endDate;
	//private MovieCategoryModel movieCategorymodel;
	private List<Long> actorIds ;
	private List<Long> cinemasIds ;
	private List<Long> procudersIds ;
	
}
