package com.tbma.book.ticket.app;

import java.util.Date;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.tbma.book.ticket.app.entities.Ticket;
import com.tbma.book.ticket.app.service.TicketBookingService;

@SpringBootApplication
public class TicketBookingManagementAppApplication {

	public static void main(String[] args) {
		//SpringApplication.run(TicketBookingManagementAppApplication.class, args);
		ConfigurableApplicationContext context = SpringApplication.run(TicketBookingManagementAppApplication.class, args);
		TicketBookingService ticketBookingservice = context.getBean("ticketBookingService", TicketBookingService.class);
		
		Ticket ticket = new Ticket();
		ticket.setTicketId(1);
		ticket.setBookingDate(new Date());
		ticket.setEmail("chuksjustin2000@gmail.com");
		ticket.setPassengerName("Chukwuka");
		ticket.setSourceStation("Abuja");
		ticket.setDestStation("Enugu");
		
		ticketBookingservice.createTicket(ticket);
	}
}
