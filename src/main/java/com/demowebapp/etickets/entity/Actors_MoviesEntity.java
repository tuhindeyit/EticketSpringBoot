package com.demowebapp.etickets.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "Actors_Movies")


public class Actors_MoviesEntity {
	@Id
	@Column(name = "MovieId")
	private Long movieId;

	@Id
	@Column(name = "ActorId")
	private Long actorId;


}
