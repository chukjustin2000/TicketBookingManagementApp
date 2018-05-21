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

	public Ticket getTicketById(Integer ticketId) {
		
		return ticketBookingDao.findOne(ticketId);
	}

	public Iterable<Ticket> getAllBookedTickets() {
		return ticketBookingDao.findAll();
	}

	public void deleteTicket(Integer ticketId) {
		 ticketBookingDao.delete(ticketId);
		
	}

	public Ticket updateTicket(int ticketId, String email) {
		Ticket ticket = ticketBookingDao.findOne(ticketId);
		ticket.setEmail(email);
		return ticketBookingDao.save(ticket);
	}

}
