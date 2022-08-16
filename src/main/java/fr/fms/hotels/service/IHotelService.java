package fr.fms.hotels.service;

import fr.fms.hotels.entities.Hotel;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface IHotelService {
    List<Hotel> getHotels();

    Hotel saveHotel(Hotel hotel);

    void deleteHotel(Long id);

    Optional<Hotel> readHotel(Long id);

    List<Hotel> readHotelsByCityId(Long cityId);
}
