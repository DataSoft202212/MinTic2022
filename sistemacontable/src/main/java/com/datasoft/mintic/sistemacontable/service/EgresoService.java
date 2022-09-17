package com.datasoft.mintic.sistemacontable.service;


import com.datasoft.mintic.sistemacontable.entity.*;
import com.datasoft.mintic.sistemacontable.repository.IEgresoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class EgresoService implements IEgresoService {

    @Autowired
    private IEgresoRepository iEgresoRepository;

    public Egreso findById(long id){
        Optional<Egreso> salidaUno = iEgresoRepository.findById(id);
        return salidaUno.get();
    }

    public List<Egreso> findAll(){
        List<Egreso> nuevoEgre = (List<Egreso>) iEgresoRepository.findAll();
        return nuevoEgre;
    }

    public Egreso createEgreso (Egreso egreso){
        Egreso newEgreso = iEgresoRepository.save(egreso);
        return newEgreso;
    }

    public Egreso updateEgreso (long id,Egreso egreso){
        Egreso putEgreso = iEgresoRepository.save(egreso);
        return putEgreso;
    }

    public void deleteEgreso(long id){

        iEgresoRepository.deleteById(id);
    }


}
