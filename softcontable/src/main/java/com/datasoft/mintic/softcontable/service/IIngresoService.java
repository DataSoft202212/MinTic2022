package com.datasoft.mintic.softcontable.service;

import com.datasoft.mintic.softcontable.entity.Ingreso;

import java.util.List;

public interface IIngresoService {

    public Ingreso findById(long id);

    public List<Ingreso> findAll();

    public Ingreso createIngreso(Ingreso ingreso);

    public Ingreso updateIngreso (long id,Ingreso ingreso);

    public void deleteIngreso(long id);
}
