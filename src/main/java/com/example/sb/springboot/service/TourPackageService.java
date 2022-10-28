package com.example.sb.springboot.service;

import com.example.sb.springboot.domain.TourPackage;
import com.example.sb.springboot.repo.TourPackageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
// @service notifies spring that this class will provide some functionalities/services
public class TourPackageService {
    private TourPackageRepository tourPackageRepository;

    @Autowired
    // @autowired annotation is used for automatic dependency injection
    public TourPackageService(TourPackageRepository tourPackageRepository) {
        this.tourPackageRepository = tourPackageRepository;
    }

    /**
     * Create a Tour Package
     *
     * @param code code of the package
     * @param name name of the package
     *
     * @return new or existing tour package
     */
    public TourPackage createTourPackage(String code, String name) {
        return tourPackageRepository.findById(code).orElse(tourPackageRepository.save(new TourPackage(code, name)));
    }

    /**
     * Lookup All Tour packages
     *
     * @return
     */
    public Iterable<TourPackage> lookup(){
        return tourPackageRepository.findAll();
    }

    public long total() {
        return tourPackageRepository.count();
    }
}