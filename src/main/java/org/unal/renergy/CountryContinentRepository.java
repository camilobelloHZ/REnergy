package org.unal.renergy;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

// Repositorio que accede a la informacion de la base de datos con el ORM Hibernate
@Repository
public interface CountryContinentRepository extends JpaRepository<CountryContinentEntity, Long> { }
