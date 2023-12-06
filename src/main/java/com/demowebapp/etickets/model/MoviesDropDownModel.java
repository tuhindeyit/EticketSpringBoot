/**
 *
 */
package com.demowebapp.etickets.model;

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
public class MoviesDropDownModel {
	private List<ProducerModel> producers;
	private List<CinemaModel> cinemas;
	private List<ActorModel> actors;
}
