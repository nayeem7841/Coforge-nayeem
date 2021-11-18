package com.airportdemo.airport.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.airportdemo.airport.DAO.BookingDAOImp;
import com.airportdemo.airport.model.Booking;


@RestController
@RequestMapping("/booking")
public class BookingController {
	@Autowired
	 private BookingDAOImp booking;
	 

    @PostMapping("/bookings")
    public Booking newbooking(@RequestBody Booking air)
    {
   	 air.setBookingId(0);
   	 booking.saveBooking(air);
   	 return air;
    }
    
    @GetMapping("/bookings/{bookingId}")
    public Booking getbookingById(@PathVariable int bookingId)
    {
   	 
   	 Booking air= booking.getBooking(bookingId);
   	 if(air==null)
   	 {
   		 throw new RuntimeException("bookingId is null in the request");
   	 }
   	 return air;
    }
    
    @DeleteMapping("/bookings/{bookingId}")
    public Booking deletebooking(@PathVariable int bookingId)
    {
   	 Booking air=booking.getBooking(bookingId);
   	 if(air==null)
   	 {
   		 throw new RuntimeException("bookingId is null in the request");
   	 }
   	 //booking.getbookingById(bookingId);
   	 booking.deleteBooking(bookingId);
   	 return air;
    }
}
