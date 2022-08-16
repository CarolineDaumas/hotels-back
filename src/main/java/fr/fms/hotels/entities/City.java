package fr.fms.hotels.entities;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonIgnore;




@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class City {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    private String name;

    @OneToMany(fetch = FetchType.EAGER) @JsonIgnore
    @JoinColumn(name = "city_id")
    private Collection<Hotel> trainings;

    public City(Long id, String name) {
        this.id = id;
        this.name = name;
    }

}
