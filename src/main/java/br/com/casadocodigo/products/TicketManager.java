package br.com.casadocodigo.products;

import java.util.*;

public class TicketManager {
    Map<String, Double> tickets;

    public TicketManager() {
        this.tickets = new HashMap<>();
        this.tickets.put("CUP74", 10.0);
        this.tickets.put("CUP120", 15.0);
        this.tickets.put("CUP132", 5.99);
        this.tickets.put("CUP200", 20.00);
        this.tickets.put("CUP400", 14.00);
        this.tickets.put("CUP221", 12.0);
    }

    public Double validateTicket(String ticket) {
        return this.tickets.get(ticket);
    }
}
