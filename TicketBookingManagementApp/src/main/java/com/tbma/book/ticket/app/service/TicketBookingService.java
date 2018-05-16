package com.tbma.book.ticket.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tbma.book.ticket.app.dao.TicketBookingDao;
import com.tbma.book.ticket.app.entities.Ticket;

@Service
public class TicketBookingService {
	
	@Autowired
	TicketBookingDao ticketBookingDao;

	public Ticket createTicket(Ticket ticket) {
		// TODO Auto-generated method stub
		return ticketBookingDao.save(ticket);
	}

}
