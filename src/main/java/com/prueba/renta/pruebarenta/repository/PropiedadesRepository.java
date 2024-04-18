package com.prueba.renta.pruebarenta.repository;

import com.prueba.renta.pruebarenta.entity.Propiedades;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PropiedadesRepository extends JpaRepository<Propiedades, Long> {
}
