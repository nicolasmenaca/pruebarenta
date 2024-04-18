package com.prueba.renta.pruebarenta.controller;

import com.prueba.renta.pruebarenta.entity.Usuarios;
import com.prueba.renta.pruebarenta.service.IUsuariosService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/usuarios")
public class UsuariosController {
    private final IUsuariosService usuariosService;

    public UsuariosController(IUsuariosService usuariosService) {
        this.usuariosService = usuariosService;
    }
    @GetMapping
    public ResponseEntity<List<Usuarios>> findAll(){
        List<Usuarios>usuarios = usuariosService.listarUsuarios();
        if (usuarios.isEmpty()){
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity<>(usuarios, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Usuarios> save(@RequestBody Usuarios usuarios){
        Usuarios usuarios1 = usuariosService.save(usuarios);
        if (usuarios1 == null){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }else {
            return new ResponseEntity<>(usuarios1, HttpStatus.OK);
        }

    }
}
