package com.example.ec.repo;

import com.example.ec.domain.Tour;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;


/**
 * Tour Repository Interface
 *
 * Created by Pedro Henrique Carvalho
 */
public interface TourRepository extends PagingAndSortingRepository<Tour, Integer> {
    Page<Tour> findByTourPackageCode(String code, Pageable pageable);
}
