package com.datasoft.mintic.softcontable.service;


import com.datasoft.mintic.softcontable.entity.*;
import com.datasoft.mintic.softcontable.repository.IEgresoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
