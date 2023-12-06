/**
 *
 */
package com.demowebapp.etickets.service.impl;

import java.util.List;

//import org.apache.catalina.realm.JNDIRealm.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demowebapp.etickets.entity.CinemasEntity;
import com.demowebapp.etickets.repository.CinemasRepository;
import com.demowebapp.etickets.service.CinemaService;

/**
 * @author tuhindeyit
 * @since Dec 5, 2023
 */
@Service
public class CinemaServiceImpl implements CinemaService {
	 @Autowired
	    private CinemasRepository cinemasRepository;
	    @Override
	    public List<CinemasEntity> getAllCinemas() {
	        return cinemasRepository.findAll();
	    }
}
