package com.datasoft.mintic.sistemacontable.service;

import com.datasoft.mintic.sistemacontable.entity.Ingreso;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public interface IIngresoService {

    public Ingreso findById(long id);

    public List<Ingreso> findAll();

    public Ingreso createIngreso(Ingreso ingreso);

    public Ingreso updateIngreso (long id,Ingreso ingreso);

    public void deleteIngreso(long id);
}
