package com.airportdemo.airport.DAO;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.airportdemo.airport.model.Booking;

@Repository
public class BookingDAOImp {

	private EntityManager entityManager;

	@Autowired
	public BookingDAOImp(EntityManager entityManager) {
		super();
		this.entityManager = entityManager;
	}
    
	public Booking saveBooking(Booking book)
	{
		Booking result=entityManager.merge(book);
		return result;
	}
	
	public Booking getBooking(int bookingId)
	{
		Booking result=entityManager.find(Booking.class,bookingId);
		return result;
	}
	
	public void deleteBooking(int bookingId)
	{
		Query theQuery=entityManager.createQuery("delete from booking where bookingId=:booking");
		theQuery.setParameter("booking", bookingId);
		theQuery.executeUpdate();
	}
}
