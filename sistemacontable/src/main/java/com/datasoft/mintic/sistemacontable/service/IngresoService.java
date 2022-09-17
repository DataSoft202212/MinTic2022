package com.datasoft.mintic.sistemacontable.service;


import com.datasoft.mintic.sistemacontable.entity.*;
import com.datasoft.mintic.sistemacontable.repository.IIngresoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class IngresoService implements IIngresoService {

    @Autowired
    private IIngresoRepository iIngresoRepository;

    public Ingreso findById(long id){
        Optional<Ingreso> entradaUno = iIngresoRepository.findById(id);
        return entradaUno.get();
    }

    public List<Ingreso> findAll(){
        List<Ingreso> nuevoIng = (List<Ingreso>) iIngresoRepository.findAll();
        return nuevoIng;
    }

    public Ingreso createIngreso(Ingreso ingreso){
        Ingreso ingresoNew = iIngresoRepository.save(ingreso);
        return ingresoNew;
    }

    public Ingreso updateIngreso (long id,Ingreso ingreso){
        Ingreso putIngreso = iIngresoRepository.save(ingreso);
        return putIngreso;
    }

    public void deleteIngreso(long id){

        iIngresoRepository.deleteById(id);
    }
}
