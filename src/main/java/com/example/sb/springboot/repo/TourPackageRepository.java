package com.example.sb.springboot.repo;

import com.example.sb.springboot.domain.TourPackage;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

// CrudRepository interface by default provides some methods to perform queries on the database
public interface TourPackageRepository extends CrudRepository<TourPackage, String> {
    Optional<TourPackage> findByName(String name);
}
