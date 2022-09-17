package com.online.repository;

import com.online.entity.TicketDAO;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TicketRepository extends CrudRepository<TicketDAO,Long> {

}
