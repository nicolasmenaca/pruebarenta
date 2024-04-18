package com.prueba.renta.pruebarenta.service.Impl;

import com.prueba.renta.pruebarenta.entity.Propiedades;
import com.prueba.renta.pruebarenta.repository.PropiedadesRepository;
import com.prueba.renta.pruebarenta.service.IPropiedadesService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PropieddadesServiceImpl implements IPropiedadesService  {

    //inyeccion de dependencia
    private final PropiedadesRepository propiedadesRepository;

    public PropieddadesServiceImpl(PropiedadesRepository propiedadesRepository) {
        this.propiedadesRepository = propiedadesRepository;
    }

    @Override
    public List<Propiedades> listarPropiedades() {
        return propiedadesRepository.findAll();
    }

    @Override
    public Propiedades save(Propiedades propiedades) {
        return propiedadesRepository.save(propiedades);
    }
}
