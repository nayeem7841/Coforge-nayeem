package com.airportdemo.airport.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="flight")
public class Flight 
{
	@Column(name="flightName")
   private String flightName;
	
    @Id
	@Column(name="fightid")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
   private int fightid;
    
	@Column(name="flightCountry")
   private String flightCountry;
   
	public Flight(String flightName, int fightid, String flightCountry) {
		super();
		this.flightName = flightName;
		this.fightid = fightid;
		this.flightCountry = flightCountry;
	}
	public String getFlightName() {
		return flightName;
	}
	public void setFlightName(String flightName) {
		this.flightName = flightName;
	}
	public int getFightid() {
		return fightid;
	}
	public void setFightid(int fightid) {
		this.fightid = fightid;
	}
	public String getFlightCountry() {
		return flightCountry;
	}
	public void setFlightCountry(String flightCountry) {
		this.flightCountry = flightCountry;
	}
   
}
