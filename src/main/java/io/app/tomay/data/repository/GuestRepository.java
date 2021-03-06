package io.app.tomay.data.repository;

import io.app.tomay.data.entity.Guest;
import org.springframework.data.repository.CrudRepository;

/**
 * @author Fidel Villanueva
 * TODO: 26/08/17
 */
public interface GuestRepository extends CrudRepository<Guest, Long> {

    Guest findById(long id);
    <S extends Guest> S save(S entity);
    Iterable<Guest> findAll();
    void delete(Long aLong);


}

