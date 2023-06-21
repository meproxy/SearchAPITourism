package com.CityTourism.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.Size;

    @Getter
    @Setter
    @Entity
    @Table(name = "tourist_places")
    public class TouristPlace {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        @Column(name = "placeName", nullable = false)
        private String placeName;

        @Column(name = "cityName", nullable = false)
        private String cityName;

        @Column(name = "description", nullable = false)
        @Size(max = 5000000)
        private String description;

        @Column(name = "photo", nullable = false)
        private String photo;

        @Column(name = "distance", nullable = false)
        private double distance;

        @Column(name = "bestTimeToVisit", nullable = false)
        private String bestTimeToVisit;

    }
