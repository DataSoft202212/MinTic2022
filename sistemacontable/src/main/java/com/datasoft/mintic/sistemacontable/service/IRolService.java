package com.datasoft.mintic.sistemacontable.service;

import com.datasoft.mintic.sistemacontable.entity.Rol;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public interface IRolService {

    public Rol findById( long id);

    public List<Rol> findAll();

    public Rol createRol(Rol rol);

    public Rol updateRol(long id, Rol rol);

    public void deleteRol(long id);


}
