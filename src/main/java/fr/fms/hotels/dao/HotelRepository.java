package fr.fms.hotels.dao;

import fr.fms.hotels.entities.Hotel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface HotelRepository extends JpaRepository<Hotel, Long> {
    List<Hotel> findByCityId(Long cityId);

    List<Hotel> findByCityName(String name);

    List<Hotel> findByCityNameContains(String name);
}
