package com.CityTourism.controller;

import com.CityTourism.entity.TouristPlace;
import com.CityTourism.repository.TouristPlaceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/tourist-places")
public class TouristPlaceController {
    @Autowired
    private TouristPlaceRepository touristPlaceRepository;

    @PostMapping
    public ResponseEntity<TouristPlace> addTouristPlace(@RequestBody TouristPlace touristPlace) {
        TouristPlace savedPlace = touristPlaceRepository.save(touristPlace);
        return ResponseEntity.ok(savedPlace);
    }
}
