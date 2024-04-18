package com.prueba.renta.pruebarenta.controller;


import com.prueba.renta.pruebarenta.entity.Propiedades;
import com.prueba.renta.pruebarenta.service.IPropiedadesService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping ("/propiedades")
public class PropiedadesController  {
    private final IPropiedadesService propiedadesService;

    public PropiedadesController(IPropiedadesService propiedadesService) {
        this.propiedadesService = propiedadesService;
    }
    @GetMapping
    public ResponseEntity<List<Propiedades>> findAll() {
        List<Propiedades> propiedades = propiedadesService.listarPropiedades();
        if (propiedades.isEmpty()){
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity<>(propiedades, HttpStatus.OK );
    }

    @PostMapping
    public ResponseEntity<Propiedades> save(@RequestBody Propiedades propiedades){
        Propiedades propiedades1 = propiedadesService.save(propiedades);
        if (propiedades1 == null){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }else {
            return new ResponseEntity<>(propiedades1, HttpStatus.OK);
        }
    }

}

