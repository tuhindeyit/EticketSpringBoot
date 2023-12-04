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
@Table(name = "Producers")

public class ProducersEntity {
	@Id
	@Column(name = "Id")
	private Long id;

	@Column(name = "ProfilePictureURL",nullable = false)
	private String profilePictureURL;

	@Column(name = "FullName",nullable = false)
	private String fullName;

	@Column(name = "Bio",nullable = false)
	private String bio;



}
