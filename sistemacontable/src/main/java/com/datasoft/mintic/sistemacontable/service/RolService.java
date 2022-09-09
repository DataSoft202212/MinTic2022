package com.datasoft.mintic.sistemacontable.service;

import com.datasoft.mintic.sistemacontable.entity.Rol;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class RolService implements IRolService {

    @Override
    public Rol findById(long id) {
        Rol rol1 = new Rol(id, "Administrador", true);
        return rol1;
    }

    @Override
    public List<Rol> findAll() {
        List<Rol> roles = new ArrayList<Rol>();
        Rol rol1 = new Rol(1, "Administrador", true);
        roles.add(rol1);
        Rol rol2 = new Rol(2, "Operador", true);
        roles.add(rol2);
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
