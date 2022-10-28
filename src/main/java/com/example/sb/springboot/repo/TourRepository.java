package com.example.sb.springboot.repo;

import com.example.sb.springboot.domain.Tour;
import org.springframework.data.repository.CrudRepository;

// CrudRepository interface by default provides some methods to perform queries on the database
public interface TourRepository extends CrudRepository<Tour, Integer> {
}
