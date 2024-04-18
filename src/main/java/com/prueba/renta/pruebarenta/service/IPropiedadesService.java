package com.prueba.renta.pruebarenta.service;

import com.prueba.renta.pruebarenta.entity.Propiedades;

import java.util.List;

public interface IPropiedadesService {

    List<Propiedades> listarPropiedades();

    Propiedades save(Propiedades propiedades);


}
