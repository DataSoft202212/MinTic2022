package com.datasoft.mintic.softcontable.service;

import com.datasoft.mintic.softcontable.entity.Egreso;

import java.util.List;

public interface IEgresoService {

    public Egreso findById(long id);

    public List<Egreso> findAll();

    public Egreso createEgreso (Egreso egreso);

    public Egreso updateEgreso (long id,Egreso egreso);

    public void deleteEgreso(long id);

}
