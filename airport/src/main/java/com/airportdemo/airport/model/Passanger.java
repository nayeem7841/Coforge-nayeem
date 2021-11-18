package com.airportdemo.airport.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="passanger")
public class Passanger 
{
	@Id
	@Column(name="pnrNumber")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer pnrNumber;
	
	@Column(name="passengerName")
    private String passengerName;
	
	@Column(name="passengerAge")
    private int passengerAge;
	
	@Column(name="luggage")
    private Double luggage;
	public Integer getPnrNumber() {
		return pnrNumber;
	}
	public void setPnrNumber(Integer pnrNumber) {
		this.pnrNumber = pnrNumber;
	}
	public String getPassengerName() {
		return passengerName;
	}
	public void setPassengerName(String passengerName) {
		this.passengerName = passengerName;
	}
	public int getPassengerAge() {
		return passengerAge;
	}
	public void setPassengerAge(int passengerAge) {
		this.passengerAge = passengerAge;
	}
	public Double getLuggage() {
		return luggage;
	}
	public void setLuggage(Double luggage) {
		this.luggage = luggage;
	}
    
    
    
}
