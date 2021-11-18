package com.airportdemo.airport.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="booking")
public class Booking
{
	@Id
	@Column(name="bookingId")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private  Integer bookingId;
	@Column(name="bookingDate")
	private  String bookingDate;
	@Column(name="noOfPassengers")
	private  int noOfPassengers;
 
	public Booking(Integer bookingId, String bookingDate, int noOfPassengers) {
		super();
		this.bookingId = bookingId;
		this.bookingDate = bookingDate;
		this.noOfPassengers = noOfPassengers;
	}
	public Integer getBookingId() {
		return bookingId;
	}
	public void setBookingId(Integer bookingId) {
		this.bookingId = bookingId;
	}
	public String getBookingDate() {
		return bookingDate;
	}
	public void setBookingDate(String bookingDate) {
		this.bookingDate = bookingDate;
	}
	public int getNoOfPassengers() {
		return noOfPassengers;
	}
	public void setNoOfPassengers(int noOfPassengers) {
		this.noOfPassengers = noOfPassengers;
	}
	 
	 

}
