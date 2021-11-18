package com.airportdemo.airport.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="airport")
public class Airport 
{
	@Id
	@Column(name="airportCode")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
    private	int airportCode;
	
	@Column(name="airportLocation")
    private	String airportLocation;

	@Column(name="airportName")
    private	 String airportName;
    
    public Airport(int airportCode,String airportLocation,String airportName)
    {
    	this.airportCode=airportCode;
    	this.airportLocation=airportLocation;
    	this.airportName=airportName;
    }
    
	public int getAirportCode() {
		return airportCode;
	}
	public void setAirportCode(int airportCode) {
		this.airportCode = airportCode;
	}
	public String getAirportLocation() {
		return airportLocation;
	}
	public void setAirportLocation(String airportLocation) {
		this.airportLocation = airportLocation;
	}
	public String getAirportName() {
		return airportName;
	}
	public void setAirportName(String airportName) {
		this.airportName = airportName;
	}
    
    
}
