package com.online.repository;

import com.online.entity.MoviesDAO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MovieRepository extends JpaRepository<MoviesDAO,Long> {
}
