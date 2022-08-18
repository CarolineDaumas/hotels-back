package fr.fms.hotels.web;


import fr.fms.hotels.entities.City;
import fr.fms.hotels.entities.Hotel;
import fr.fms.hotels.service.ImplHotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("/api")
public class HotelController {

    @Autowired
    private ImplHotelService implHotelService;

    @GetMapping("/hotels")
    public List<Hotel> allHotels() {
        return implHotelService.getHotels();
    }

    @PostMapping("/hotels")
    public Hotel saveHotel(@RequestBody Hotel h) {
        return implHotelService.saveHotel(h);
    }

    @DeleteMapping("/hotels/{id}")
    public void deleteHotel(@PathVariable("id") Long id) {
        implHotelService.deleteHotel(id);
    }

    @GetMapping("/hotels/{id}")
    public Hotel getHotelById(@PathVariable("id") Long id) {
        return implHotelService.readHotel(id).get();
    }

    @GetMapping("/cities")
    public List<City> allCities() {
        return implHotelService.readAllCities();
    }

    @PostMapping("/cities")
    public City saveCity(@RequestBody City c) {
        return implHotelService.saveCity(c);
    }

    @GetMapping("/cities/{id}/hotels")
    public List<Hotel> allHotelsByCityId(@PathVariable ("id") Long id)
    { return implHotelService.readHotelsByCityId(id);}


    @GetMapping("/research/{name}")
    public List<Hotel> getHotelsBySearch(@PathVariable("name") String name) {
        List<Hotel> hotelsBySearch = implHotelService.readHotelsByCityNameContains(name);
        return hotelsBySearch;
    }

}
