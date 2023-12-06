package com.demowebapp.etickets.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demowebapp.etickets.entity.MoviesEntity;

/**
 * @author tuhindeyit
 * @since Dec 4, 2023
 */
@Repository
public interface MoviesRepository extends JpaRepository<
MoviesEntity, Long> {

}
