package fr.fms.hotels;

import fr.fms.hotels.dao.CityRepository;
import fr.fms.hotels.dao.HotelRepository;
import fr.fms.hotels.downupload.FileUploadProperties;
import fr.fms.hotels.entities.City;
import fr.fms.hotels.entities.Hotel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties({FileUploadProperties.class})
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

		City toulouse=new City(null, "Toulouse");
		City biarritz=new City(null, "Biarritz");
		City lyon=new City(null, "Lyon");
		City montpellier=new City(null, "Montpellier");
		City londres=new City(null, "Londres");
		City barcelone=new City(null, "Barcelone");
		cityRepository.save(toulouse);
		cityRepository.save(biarritz);
		cityRepository.save(lyon);
		cityRepository.save(montpellier);
		cityRepository.save(londres);
		cityRepository.save(barcelone);

		hotelRepository.save(new Hotel(null, "Hôtel du Midi", "30 allée Charles de Fitte",4,
				10,50,"chambreToulouse.jpg",toulouse));
		hotelRepository.save(new Hotel(null, "Hôtel du Sud", "10 rue de la Paix",2,8,200,"hotelToulouse2.jpg",toulouse));
		hotelRepository.save(new Hotel(null, "Hôtel du Midi", "30 rue de Rémusat",3,2,50,"chambreBiarritz.jpg",biarritz));
		hotelRepository.save(new Hotel(null, "Hôtel de Lyon", "15 rue des pommiers",1,3,30,"chambreLyon.jpg",lyon));
		hotelRepository.save(new Hotel(null, "Hôtel de la mer", "10 allée de la Mer",4,6,100,"chambreMontpellier.jpg",montpellier));
		hotelRepository.save(new Hotel(null, "Hôtel du Tower Bridge", "5 Long Street",5,4,300,"chambreLondres.jpg",londres));
		hotelRepository.save(new Hotel(null, "Hôtel d'Espana", "30 via de la guardia",4,10,300,"hotelBarcelone.jpg",barcelone));
		hotelRepository.save(new Hotel(null, "Hôtel du Sud-Ouest", "30 allée Laurent Blanc",3,
				6,60,"chambre1.jpg",biarritz));
		hotelRepository.save(new Hotel(null, "Hôtel de la rosette", "10 rue Louis Blanc",3,
				12,80,"chambre2.jpg",lyon));
		hotelRepository.save(new Hotel(null, "Hôtel Arceaux", "12 rue Marguerite",1,
				25,30,"chambre3.jpg",montpellier));
		hotelRepository.save(new Hotel(null, "Hôtel Confort", "35 avenue Charles De Gaulle",4,
				8,150,"chambre4.jpg",londres));
		hotelRepository.save(new Hotel(null, "Auberge Aline", "12 rue du Chat Perché",1,
				16,30,"chambre5.jpg",barcelone));
		hotelRepository.save(new Hotel(null, "Hôtel de Saint Cyprien", "90 allée Charles de Fitte",3,
				11,70,"chambre6.jpg",toulouse));
		hotelRepository.save(new Hotel(null, "Hôtel de l'Océan", "30 allée de l'Océan",4,
				4,90,"chambre7.jpg",biarritz));
		hotelRepository.save(new Hotel(null, "Hôtel de l'Exode", "24 rue du Prieuré",3,
				22,80,"chambre8.jpg",lyon));
		hotelRepository.save(new Hotel(null, "Hôtel de la Vague", "10 rue des bonnes soeurs",4,
				14,125,"chambre9.jpg",montpellier));
		hotelRepository.save(new Hotel(null, "Hôtel Luxueux", "30 Winston Churchill Street",5,
				10,500,"chambre10.jpg",londres));
	}
}
