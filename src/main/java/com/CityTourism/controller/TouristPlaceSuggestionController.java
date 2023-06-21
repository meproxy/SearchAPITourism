package com.CityTourism.controller;

import com.CityTourism.entity.TouristPlace;
import com.CityTourism.repository.TouristPlaceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/suggested-places")
public class TouristPlaceSuggestionController {
    @Autowired
    private TouristPlaceRepository touristPlaceRepository;

    @GetMapping
    public ResponseEntity<List<TouristPlace>> suggestTouristPlaces(@RequestParam("cityName") String cityName, @RequestParam("distance") double distance) {
        List<TouristPlace> suggestedPlaces = touristPlaceRepository.findByCityNameAndDistanceLessThanEqual(cityName, distance);
        return ResponseEntity.ok(suggestedPlaces);
    }
}



