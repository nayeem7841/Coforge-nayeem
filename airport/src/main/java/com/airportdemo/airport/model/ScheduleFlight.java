package com.airportdemo.airport.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name="scheduleflight")
public class ScheduleFlight
{
	
		@Id
		@Column(name="scheduleFlightId")
		@GeneratedValue(strategy=GenerationType.IDENTITY)
	    private Integer scheduleFlightId;
	   
		@Transient
		private Flight flight;
		
		@Column(name="flightId")
		private int flightId;
		
		@Column(name="availableSeats")
		private Integer availableSeats;
		
		@Transient
	    private Schedule schedule;
	    
		@Column(name="scheduleId")
	    private Integer scheduleId;
		public int getFlightId() {
			return flightId;
		}
		public void setFlightId(int flightId) {
			this.flightId = flightId;
		}
		
		public ScheduleFlight(Integer scheduleFlightId, Flight flight, Integer availableSeats, Schedule schedule,int flighId,Integer scheduleId) {
			super();
			this.scheduleFlightId = scheduleFlightId;
			this.flight = flight;
			this.availableSeats = availableSeats;
			this.schedule = schedule;
			this.flightId=flighId;
			this.scheduleId=scheduleId;
		}
		

		public Integer getScheduleId() {
			return scheduleId;
		}
		public void setScheduleId(Integer scheduleId) {
			this.scheduleId = scheduleId;
		}
		public Integer getScheduleFlightId() {
			return scheduleFlightId;
		}
		public void setScheduleFlightId(Integer scheduleFlightId) {
			this.scheduleFlightId = scheduleFlightId;
		}
		public Integer getAvailableSeats() {
			return availableSeats;
		}
		public void setAvailableSeats(Integer availableSeats) {
			this.availableSeats = availableSeats;
		}
		public Schedule getSchedule() {
			return schedule;
		}
		public void setSchedule(Schedule schedule) {
			this.schedule = schedule;
		}
		 public Flight getFlight() {
				return flight;
			}
			public void setFlight(Flight flight) {
				this.flight = flight;
			}
	    
}
