package com.airportdemo.airport.services;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Service;

import com.airportdemo.airport.DAO.AirportDAOImp;
import com.airportdemo.airport.model.Airport;

@Service
public class AirportServices {

	
	public void newAirport(Airport air)
	{
		
	}
	
	public void DeleteAirport(int id)
	{
		
		//return "the record did not delete in database";
	}
	public AirportDAOImp getAirportById(int id)
	{
		
		return null;
	}
}
