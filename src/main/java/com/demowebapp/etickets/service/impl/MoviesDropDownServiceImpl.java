/**
 *
 */
package com.demowebapp.etickets.service.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demowebapp.etickets.entity.ActorsEntity;
import com.demowebapp.etickets.entity.CinemasEntity;
import com.demowebapp.etickets.entity.ProducersEntity;
import com.demowebapp.etickets.model.ActorModel;
import com.demowebapp.etickets.model.CinemaModel;
import com.demowebapp.etickets.model.MoviesDropDownModel;
import com.demowebapp.etickets.model.ProducerModel;
import com.demowebapp.etickets.repository.ActorsRepository;
import com.demowebapp.etickets.repository.CinemasRepository;
import com.demowebapp.etickets.repository.ProducersRepository;
import com.demowebapp.etickets.service.MoviesDropDownService;

/**
 * @author tuhindeyit
 * @since Dec 5, 2023
 */
@Service
public class MoviesDropDownServiceImpl implements MoviesDropDownService {
	@Autowired
	private CinemasRepository cinemasRepository;
	private ActorsRepository actorsRepository;
	private ProducersRepository producersRepository;

	@Override
	public MoviesDropDownModel getAllMovieDropDown() {
		MoviesDropDownModel obj = new MoviesDropDownModel();
		List<ActorsEntity> actorEntities = actorsRepository.findAll();
		List<ProducersEntity> producerEntities = producersRepository.findAll();
		List<CinemasEntity> cinemaEntities = cinemasRepository.findAll();

		List<ActorModel> actorModels = actorEntities.stream().map(e -> {
			ActorModel m = new ActorModel();
			BeanUtils.copyProperties(e, m);
			return m;
		}).collect(Collectors.toList());
		obj.setActors(actorModels);
		List<ProducerModel> producerModels = producerEntities.stream().map(e -> {
			ProducerModel pr = new ProducerModel();
			BeanUtils.copyProperties(e, pr);
			return pr;
		}).collect(Collectors.toList());
		obj.setProducers(producerModels);
		
		List<CinemaModel>cinemaModels=cinemaEntities.stream().map(e->{
			CinemaModel cm=new CinemaModel();
			BeanUtils.copyProperties(e, cm);
			return cm;
		}).collect(Collectors.toList());
		 obj.setCinemas(cinemaModels);
		return obj;
	}

}
