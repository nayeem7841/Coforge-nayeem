package com.airportdemo.airport.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name="schedule")
public class Schedule 
{
	@Id
	@Column(name="scheduleid")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer scheduleId;
	
	@Transient
    private Airport srcAirport;
    @Column(name="srcairportid")
    private Integer srcAirportId;
    
    @Column(name="dstnairpotid")
    private Integer dstnAirpotId;
    
    public Integer getSrcAirportId() {
		return srcAirportId;
	}
	public void setSrcAirportId(Integer srcAirportId) {
		this.srcAirportId = srcAirportId;
	}
	public Integer getDstnAirpotId() {
		return dstnAirpotId;
	}
	public void setDstnAirpotId(Integer dstnAirpotId) {
		this.dstnAirpotId = dstnAirpotId;
	}
	
	@Transient
	private Airport dstnAirport;
	
    @Column(name="deptdatetime")
    private String deptDateTime;
    public Schedule(Integer scheduleId, Airport srcAirport, Integer srcAirportId, Integer dstnAirpotId,
			Airport dstnAirport, String deptDateTime, String arrDateTime) {
		super();
		this.scheduleId = scheduleId;
		this.srcAirport = srcAirport;
		this.srcAirportId = srcAirportId;
		this.dstnAirpotId = dstnAirpotId;
		this.dstnAirport = dstnAirport;
		this.deptDateTime = deptDateTime;
		this.arrDateTime = arrDateTime;
	}
    
    @Column(name="arrdatetime")
	private String arrDateTime;
    
	public Integer getScheduleId() {
		return scheduleId;
	}
	public void setScheduleId(Integer scheduleId) {
		this.scheduleId = scheduleId;
	}
	public Airport getSrcAirport() {
		return srcAirport;
	}
	public void setSrcAirport(Airport srcAirport) {
		this.srcAirport = srcAirport;
	}
	public Airport getDstnAirport() {
		return dstnAirport;
	}
	public void setDstnAirport(Airport dstnAirport) {
		this.dstnAirport = dstnAirport;
	}
	public String getDeptDateTime() {
		return deptDateTime;
	}
	public void setDeptDateTime(String deptDateTime) {
		this.deptDateTime = deptDateTime;
	}
	public String getArrDateTime() {
		return arrDateTime;
	}
	public void setArrDateTime(String arrDateTime) {
		this.arrDateTime = arrDateTime;
	}
    
    
    
}
