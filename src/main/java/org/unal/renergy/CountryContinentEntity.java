package org.unal.renergy;

import jakarta.persistence.*;
import lombok.Data;

// Entidad que represneta el objeto guardado en base de datos
@Entity
@Data
@Table( name = "entities")
public class CountryContinentEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String name;

    private boolean is_country;
}
