package com.airportdemo.airport.DAO;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.airportdemo.airport.model.Airport;
import com.airportdemo.airport.services.AirportServices;

@Repository
public class AirportDAOImp {

	private EntityManager entityManager;
	
	@Autowired
	private AirportServices airportServices;

	@Autowired
	public AirportDAOImp(EntityManager entityManager) {
		super();
		this.entityManager = entityManager;
	}
	
	@Transactional
	public List<Airport> getAllAirport()
	{
		Session currentse= entityManager.unwrap(Session.class);
		
		List<Airport> theQuery= currentse.createQuery("from Airport",Airport.class).getResultList();
		
		return theQuery;
	}
	
	@Transactional
	public Airport getAirportById(int airportCode)
	{
		Session currentse= entityManager.unwrap(Session.class);
		Airport record=currentse.get(Airport.class,airportCode);
		return record;
	}
	
	@Transactional
	public void DeleteAirportById(int airportCode)
	{
		Session currentse= entityManager.unwrap(Session.class);
		
		Query theQuery= currentse.createQuery("delete from Airport where airportCode=:airportCodetoDelete");
		
		theQuery.setParameter("airportCodetoDelete", airportCode);
		theQuery.executeUpdate();
	}
	
	@Transactional
	public Airport NewAirport(Airport a)
	{
		Session currentse= entityManager.unwrap(Session.class);
		currentse.saveOrUpdate(a);
		return a;
	}
}
