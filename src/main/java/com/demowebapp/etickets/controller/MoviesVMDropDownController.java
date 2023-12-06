/**
 *
 */
package com.demowebapp.etickets.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demowebapp.etickets.model.MoviesDropDownModel;
import com.demowebapp.etickets.service.MoviesDropDownService;

/**
 * @author tuhindeyit
 * @since Dec 6, 2023
 */
@RestController
@RequestMapping("/object")

public class MoviesVMDropDownController {
	@Autowired
	private MoviesDropDownService mvDdlService;
	
	  public ResponseEntity<MoviesDropDownModel> getData() {
	        // Logic to retrieve data
		  MoviesDropDownModel responseData = mvDdlService.getAllMovieDropDown();
	        return new ResponseEntity<>(responseData, HttpStatus.OK);
	    }

}
