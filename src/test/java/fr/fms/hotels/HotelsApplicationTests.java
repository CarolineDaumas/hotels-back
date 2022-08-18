package fr.fms.hotels;

import fr.fms.hotels.entities.City;
import fr.fms.hotels.entities.Hotel;
import fr.fms.hotels.service.ImplHotelService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

@SpringBootTest
class HotelsApplicationTests {

	@Autowired
	ImplHotelService implHotelService;

	@Test
	void contextLoads() {assertFalse(1 == 2);
	}

	@Test
	void testAddHotel() {
		Hotel hotel = new Hotel(123L, "Hotel Roger", "12 rue Lampion", 4, 10, 200, "chambreBiarritz.jpg", new City(10L, "New-York"));

		try {
			implHotelService.saveHotel(hotel);
			assertEquals(implHotelService.readHotel(123L).get(), hotel);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
		@Test
		void testReadCities() {
			try {
				assertThat(implHotelService.readCityById((long) 1)).isNotNull();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	@Test
	void testGetHotels() {
		Hotel hotel = new Hotel(123L, "Hotel Roger", "12 rue Lampion", 4, 10,
				200, "chambreBiarritz.jpg", new City(10L, "New-York"));
		try {
			assertThat(implHotelService.readHotel((long) 123)).isNotNull();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

//	@Test
//	void testHotelDeleted() {
//		Hotel hotel = new Hotel(123L, "Hotel Roger", "12 rue Lampion", 4, 10,
//				200, "chambreBiarritz.jpg", new City(10L, "New-York"));
//		try {
//			implHotelService.saveHotel(hotel);
//			implHotelService.deleteHotel(123L);
//			assertThat(implHotelService.readHotel(123L).get().isNull());
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//	}

	@Test
	void testReadByCityContains() {
		Hotel hotel = new Hotel(123L, "Hotel Roger", "12 rue Lampion", 4, 10,
		200, "chambreBiarritz.jpg", new City(10L, "New-York"));

		try {
			implHotelService.saveHotel(hotel);
			assertThat(implHotelService.readHotelsByCityNameContains("or")).isNotNull();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}



	}


