package com.prueba.renta.pruebarenta.service.Impl;

import com.prueba.renta.pruebarenta.entity.Usuarios;
import com.prueba.renta.pruebarenta.repository.UsuariosRepository;
import com.prueba.renta.pruebarenta.service.IUsuariosService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuariosServiceImpl implements IUsuariosService {

    private final UsuariosRepository usuariosRepository;

    public UsuariosServiceImpl(UsuariosRepository usuariosRepository) {
        this.usuariosRepository = usuariosRepository;
    }

    @Override
    public List<Usuarios> listarUsuarios() {
        return usuariosRepository.findAll();
    }

    @Override
    public Usuarios save(Usuarios usuarios) {
        return usuariosRepository.save(usuarios);
    }
}
