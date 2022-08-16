package fr.fms.hotels;

import fr.fms.hotels.dao.CityRepository;
import fr.fms.hotels.dao.HotelRepository;
import fr.fms.hotels.entities.City;
import fr.fms.hotels.entities.Hotel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HotelsApplication implements CommandLineRunner {

	@Autowired
	private CityRepository cityRepository;

	@Autowired
	private HotelRepository hotelRepository;


	public static void main(String[] args) {
		SpringApplication.run(HotelsApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

//		City toulouse=new City(null, "Toulouse");
//		City biarritz=new City(null, "Biarritz");
//		City lyon=new City(null, "Lyon");
//		City montpellier=new City(null, "Montpellier");
//		City londres=new City(null, "Londres");
//		City barcelone=new City(null, "Barcelone");
//		cityRepository.save(toulouse);
//		cityRepository.save(biarritz);
//		cityRepository.save(lyon);
//		cityRepository.save(montpellier);
//		cityRepository.save(londres);
//		cityRepository.save(barcelone);
//
//		hotelRepository.save(new Hotel(null, "Hôtel du Midi", "30 allée Charles de Fitte",4,10,50,toulouse));
//		hotelRepository.save(new Hotel(null, "Hôtel du Sud", "10 rue de la Paix",2,8,30,toulouse));
//		hotelRepository.save(new Hotel(null, "Hôtel du Midi", "30 rue de Rémusat",3,2,50,biarritz));
//		hotelRepository.save(new Hotel(null, "Hôtel de Lyon", "15 rue des pommiers",1,3,30,lyon));
//		hotelRepository.save(new Hotel(null, "Hôtel de la mer", "10 allée de la Mer",4,6,100,montpellier));
//		hotelRepository.save(new Hotel(null, "Hôtel du Tower Bridge", "5 Long Street",5,4,300,londres));
//		hotelRepository.save(new Hotel(null, "Hôtel d'Espana", "30 via de la guardia",4,10,90,barcelone));
	}
}
