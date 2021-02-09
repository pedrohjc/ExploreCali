package com.example.ec.repo;

import com.example.ec.domain.Tour;
import org.springframework.data.repository.CrudRepository;


/**
 * Tour Repository Interface
 *
 * Created by Pedro Henrique Carvalho
 */
public interface TourRepository extends CrudRepository<Tour, Integer> {
}
