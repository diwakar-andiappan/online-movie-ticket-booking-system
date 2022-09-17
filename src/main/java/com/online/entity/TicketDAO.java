package com.online.entity;

import com.online.request.TicketInfo;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@AllArgsConstructor
@Entity
@Table(name = "Tickets")
public class TicketDAO {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @ManyToOne
    @Column(name = "id")
    private long id;

    @Column(name = "ticket_type")
    private String ticketType;
    @Column(name = "total_seats")
    private Integer totalSeats;
    @Column(name = "available_seats")
    private Integer availableSeats;
    @Column(name = "price")
    private Double price;
    @Column(name = "currency")
    private String currency;

    public TicketDAO(TicketInfo ticketInfo){
        this.id=ticketInfo.getId();
        this.ticketType=ticketInfo.getTicketType();
        this.availableSeats= ticketInfo.getAvailableSeats();
        this.currency=ticketInfo.getCurrency();
        this.totalSeats=ticketInfo.getTotalSeats();
        this.price=ticketInfo.getPrice();
    }
}
