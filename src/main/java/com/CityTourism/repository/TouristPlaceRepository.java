package com.CityTourism.repository;

import com.CityTourism.entity.TouristPlace;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TouristPlaceRepository extends JpaRepository<TouristPlace, Long> {
    List<TouristPlace> findByCityNameAndDistanceLessThanEqual(String cityName, double distance);
    //Spring Data JPA analyzes the method name and automatically generates the appropriate query based on the naming conventions and the properties of the entity.
}


