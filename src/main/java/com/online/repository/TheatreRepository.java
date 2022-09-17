package com.online.repository;

import com.online.entity.TheatreDAO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TheatreRepository extends JpaRepository<TheatreDAO,Long> {
}
