package com.datasoft.mintic.sistemacontable.service;

import com.datasoft.mintic.sistemacontable.entity.Rol;
import com.datasoft.mintic.sistemacontable.repository.IRolRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class RolService implements IRolService {
    @Autowired
    private IRolRepository rolRepository;

    @Override
    public Rol findById(long id) {
        Optional<Rol> rol1 = rolRepository.findById(id);
        return rol1.get();
    }

    @Override
    public List<Rol> findAll() {
        List<Rol> roles = (List<Rol>) rolRepository.findAll();
        return roles;
    }

    @Override
    public Rol createRol(Rol rol) {
        Rol nuevoRol = new Rol(rol.getIdRol(), rol.getDescripcionRol(), rol.isEstadoRol());
        return nuevoRol;
    }

    @Override
    public Rol updateRol(long id, Rol rol) {
        Rol putRol = findById(id);
        putRol.setDescripcionRol(rol.getDescripcionRol());
        putRol.setEstadoRol(rol.isEstadoRol());
        return putRol;
    }

    @Override
    public void deleteRol(long id) {

        Rol delRol = findById(id);
    }
}
