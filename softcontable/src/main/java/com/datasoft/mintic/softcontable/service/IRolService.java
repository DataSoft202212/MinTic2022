package com.datasoft.mintic.softcontable.service;

import com.datasoft.mintic.softcontable.entity.Rol;

import java.util.List;

public interface IRolService {

    public Rol findById( long id);

    public List<Rol> findAll();

    public Rol createRol(Rol rol);

    public Rol updateRol(long id, Rol rol);

    public void deleteRol(long id);


}
