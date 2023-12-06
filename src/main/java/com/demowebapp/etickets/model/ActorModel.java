/**
 *
 */
package com.demowebapp.etickets.model;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor


/**
 * @author tuhindeyit
 * @since Dec 5, 2023
 */
public class ActorModel {
	private Long id;
	private String profilePictureURL;
	private String fullName;
	private String bio;
	
}
