package com.datasoft.mintic.sistemacontable.service;

import com.datasoft.mintic.sistemacontable.entity.Egreso;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public interface IEgresoService {

    public Egreso findById(long id);

    public List<Egreso> findAll();

    public Egreso createEgreso (Egreso egreso);

    public Egreso updateEgreso (long id,Egreso egreso);

    public void deleteEgreso(long id);

}
