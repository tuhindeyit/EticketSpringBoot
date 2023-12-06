/**
 *
 */
package com.demowebapp.etickets.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demowebapp.etickets.entity.CinemasEntity;
import com.demowebapp.etickets.entity.MoviesEntity;

/**
 * @author tuhindeyit
 * @since Dec 5, 2023
 */
@Repository
public interface CinemasRepository extends JpaRepository<
CinemasEntity, Long> {
}