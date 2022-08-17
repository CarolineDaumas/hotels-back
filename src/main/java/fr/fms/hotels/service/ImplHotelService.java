package fr.fms.hotels.service;


import fr.fms.hotels.dao.CityRepository;
import fr.fms.hotels.dao.HotelRepository;
import fr.fms.hotels.entities.City;
import fr.fms.hotels.entities.Hotel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ImplHotelService implements IHotelService{
    @Autowired
    HotelRepository hotelRepository;

    @Autowired
    CityRepository cityRepository;

    @Override
    public List<Hotel> getHotels() {
        return hotelRepository.findAll();
    }

    @Override
    public Hotel saveHotel(Hotel hotel) {
        return hotelRepository.save(hotel);
    }

    @Override
    public void deleteHotel(Long id) {
        hotelRepository.deleteById(id);
    }

    @Override
    public  Optional<Hotel> readHotel(Long id) {
        return hotelRepository.findById(id);
    }

    public List<City> readAllCities() {
        return cityRepository.findAll();
    }

    @Override
    public List<Hotel> readHotelsByCityId(Long cityId) {
        return hotelRepository.findByCityId(cityId);
    }

    @Override
    public List<Hotel> readHotelsByCityName(String name) {
        return hotelRepository.findByCityName(name);
    }

    @Override
    public List<Hotel> readHotelsByCityNameContains(String name) {
        return hotelRepository.findByCityNameContains(name);
    }
}
