package org.example.springboot.learningspring.repository;

import com.magyarzoli.learningspring.data.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.sql.Date;

@Repository
public interface ReservationRepository
        extends JpaRepository<Reservation, Long> {

    Iterable<Reservation> findReservationByReservationDate(Date date);
}