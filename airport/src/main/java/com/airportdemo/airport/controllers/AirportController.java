package com.airportdemo.airport.controllers;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.airportdemo.airport.DAO.AirportDAOImp;
import com.airportdemo.airport.model.Airport;


@RestController
@RequestMapping("/apiairport")
public class AirportController 
{
	 @Autowired
	 private AirportDAOImp airport;
	 
	 @GetMapping("/airports")
     public List<Airport> getAllAirports()
     {
    	 return airport.getAllAirport();
     }
     @PostMapping("/airports")
     public Airport newAirPort(@RequestBody Airport air)
     {
    	 air.setAirportCode(0);
    	 airport.NewAirport(air);
    	 return air;
     }
     
     @GetMapping("/airports/{airportId}")
     public Airport getAirportById(@PathVariable int airportId)
     {
    	 
    	 Airport air= airport.getAirportById(airportId);
    	 if(air==null)
    	 {
    		 throw new RuntimeException("airportId is null in the request");
    	 }
    	 return air;
     }
     
     @DeleteMapping("/airports/{airportId}")
     public Airport deleteAirport(@PathVariable int airportId)
     {
    	 Airport air=airport.getAirportById(airportId);
    	 if(air==null)
    	 {
    		 throw new RuntimeException("airportId is null in the request");
    	 }
    	 //airport.getAirportById(airportId);
    	 airport.DeleteAirportById(airportId);
    	 return air;
     }
     
}