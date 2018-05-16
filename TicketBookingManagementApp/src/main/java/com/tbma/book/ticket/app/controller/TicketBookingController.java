package com.tbma.book.ticket.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tbma.book.ticket.app.entities.Ticket;
import com.tbma.book.ticket.app.service.TicketBookingService;

@RestController
@RequestMapping(value="api/tickets")
public class TicketBookingController {
	
	@Autowired
	TicketBookingService ticketBookingService;
	
	@PostMapping(value="/create")
	public Ticket createTicket(Ticket ticket) {
		return ticketBookingService.createTicket(ticket);
	}
}
