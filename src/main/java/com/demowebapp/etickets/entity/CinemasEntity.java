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
@Table(name = "Cinemas")

public class CinemasEntity {
	@Id
	@Column(name = "Id")
	private Long id;

	@Column(name = "Logo",nullable = false)
	private String logo;

	@Column(name = "Name",nullable = false)
	private String Name;

	@Column(name = "Description",nullable = false)
	private String description;

}
