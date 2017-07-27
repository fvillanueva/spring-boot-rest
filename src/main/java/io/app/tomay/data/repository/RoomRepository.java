package io.app.tomay.data.repository;

import io.app.tomay.data.entity.Room;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface RoomRepository extends CrudRepository<Room, Long> {
    Room findByNumber(String number);

    @Override
    <S extends Room> S save(S entity);

    @Override
    void delete(Long aLong);

    @Override
    Iterable<Room> findAll();

    @Override
    Room findOne(Long aLong);
}
