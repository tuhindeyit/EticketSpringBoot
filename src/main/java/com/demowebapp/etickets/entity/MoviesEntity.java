package com.demowebapp.etickets.entity;

import java.time.LocalDateTime;

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
@Table(name = "Movies")

public class MoviesEntity {
	@Id
	@Column(name = "Id")
	// @GeneratedValue(strategy = GenerationType.IDENTITY)
	// @SequenceGenerator(name = "ITMS_OBJ_COMM_MST_HDR_SEQ", sequenceName =
	// "ITMS_OBJ_COMM_MST_HDR_SEQ", allocationSize = 1)
	private Long id;

	@Column(name = "OCMH_OBJECT_ID")
	private String objectId;

	@Column(name = "Name")
	private String name;

	@Column(name = "Description", nullable = false)
	private String description;

	@Column(name = "Price")
	private float price;

	@Column(name = "ImageURL")
	private String imageURL;

	@Column(name = "StartDate")
	private LocalDateTime startDate;

	@Column(name = "EndDate")
	private LocalDateTime endDate;

	@Column(name = "MovieCategory")
	private int movieCategory;

	@Column(name = "CinemaId")
	private int cinemaId;

	@Column(name = "ProducerId")
	private int producerId;

}
