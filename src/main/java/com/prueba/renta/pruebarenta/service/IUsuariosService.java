package com.prueba.renta.pruebarenta.service;

import com.prueba.renta.pruebarenta.entity.Usuarios;

import java.util.List;

public interface IUsuariosService {

    List<Usuarios> listarUsuarios();

    Usuarios save(Usuarios usuarios);

}
