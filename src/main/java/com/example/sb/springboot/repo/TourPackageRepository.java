package com.example.sb.springboot.repo;

import com.example.sb.springboot.domain.TourPackage;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

import java.util.Optional;

// CrudRepository interface by default provides some methods to perform queries on the database
// PagingAndSortingRepository - also works fine, set return type `Page` along with `Pageable` as parameter
// example - localhost:8080/tours/search/findByTourPackageName?size=&page=&sort=title,asc
@RepositoryRestResource(collectionResourceRel = "packages", path = "packages")
// class level - defined custom endpoints
public interface TourPackageRepository extends CrudRepository<TourPackage, String> {

    Optional<TourPackage> findByName(String name);

    @Override
    @RestResource(exported = false)
    // method level
    Iterable<TourPackage> findAll();

    @Override
    @RestResource(exported = false)
    <S extends TourPackage> S save(S entity);

    @Override
    @RestResource(exported = false)
    <S extends TourPackage> Iterable<S> saveAll(Iterable<S> entities);

    @Override
    @RestResource(exported = false)
    void deleteById(String s);

    @Override
    @RestResource(exported = false)
    void delete(TourPackage entity);

    @Override
    @RestResource(exported = false)
    void deleteAllById(Iterable<? extends String> strings);

    @Override
    @RestResource(exported = false)
    void deleteAll(Iterable<? extends TourPackage> entities);

    @Override
    @RestResource(exported = false)
    void deleteAll();
}
