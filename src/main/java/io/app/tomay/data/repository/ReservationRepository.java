package io.app.tomay.data.repository;

import io.app.tomay.data.entity.Reservation;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


import java.sql.Date;
import java.util.List;


@Repository
public interface ReservationRepository extends CrudRepository<Reservation, Long> {
    List<Reservation> findByDate(Date date);
    <S extends Reservation> S save(S entity);
    void delete(Long aLong);
    Reservation findOne(Long aLong);
}
