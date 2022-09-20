package com.datasoft.mintic.softcontable.service;

import com.datasoft.mintic.softcontable.entity.Rol;
import com.datasoft.mintic.softcontable.repository.IRolRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
       Rol nuevoRol = rolRepository.save(rol);
       return nuevoRol;
    }

    @Override
    public Rol updateRol(long id, Rol rol) {
        Rol putRol = rolRepository.save(rol);
        return putRol;
    }

    @Override
    public void deleteRol(long id) {
        rolRepository.deleteById(id);
    }
}
