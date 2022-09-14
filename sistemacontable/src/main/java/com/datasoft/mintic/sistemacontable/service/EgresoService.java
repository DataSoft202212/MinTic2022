package com.datasoft.mintic.sistemacontable.service;


import com.datasoft.mintic.sistemacontable.entity.*;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class EgresoService implements IEgresoService {

    public Egreso findById(long id){
        Egreso salidaUno = new Egreso(id,TipoMovimiento.EGRESO,new Usuario(1,new TipoDocumento(001,"Cedula Ciudadania","CC",true),"10752341223","Carlos","perez","popayan",603134567,"cperez@hotmail.com",new Rol(0001,"Operario",true),"1q2w3e4r5t",true),new Empresa(01,900234567,"E-comercio","cali",87612345,"e.comercio@hotmail.com"),001,new Date(),450000,"pago administracion pagina");
        return salidaUno;
    }

    public List<Egreso> findAll(){
        List<Egreso> nuevoEgre = new ArrayList<Egreso>();
        Egreso egresoUno = new Egreso(001, TipoMovimiento.EGRESO,new Usuario(1,new TipoDocumento(001,"Cedula Ciudadania","CC",true),"10752341223","Carlos","perez","popayan",603134567,"cperez@hotmail.com",new Rol(0001,"Operario",true),"1q2w3e4r5t",true),new Empresa(01,900234567,"E-comercio","cali",87612345,"e.comercio@hotmail.com"),001,new Date(),450000,"pago administracion pagina");
        nuevoEgre.add(egresoUno);
        Egreso egresoDos = new Egreso(002,TipoMovimiento.EGRESO,new Usuario(2,new TipoDocumento(001,"Cedula Ciudadania","CC",true),"52451223","Maria","Jimenez","Medellin",603134897,"marijime@hotmail.com",new Rol(0002,"admon",true),"1q2w3e4r5t",true),new Empresa(02,900223587,"MSI-support","Bogota",87612049,"msi-support@hotmail.com"),002,new Date(),250000,"pago servicios");
        nuevoEgre.add(egresoDos);
        return nuevoEgre;
    }

    public Egreso createEgreso (Egreso egreso){
        Egreso newEgreso = new Egreso(egreso.getIdMovDinero(), egreso.getTipoMovDinero(),egreso.getUserMovDinero(),egreso.getEmpresaMovDinero(), egreso.getIdEgreso(),egreso.getFechaEgreso(), egreso.getValorEgreso(), egreso.getConceptoEgreso());
        return newEgreso;
    }

    public Egreso updateEgreso (long id,Egreso egreso){
        Egreso putEgreso = findById(id);
        putEgreso.setIdMovDinero(egreso.getIdMovDinero());
        putEgreso.setTipoMovDinero(egreso.getTipoMovDinero());
        putEgreso.setUserMovDinero(egreso.getUserMovDinero());
        putEgreso.setEmpresaMovDinero(egreso.getEmpresaMovDinero());
        putEgreso.setFechaEgreso(egreso.getFechaEgreso());
        putEgreso.setValorEgreso(egreso.getValorEgreso());
        putEgreso.setConceptoEgreso(egreso.getConceptoEgreso());
        return putEgreso;
    }

    public void deleteEgreso(long id){
        Egreso delEgreso = findById(id);
    }


}
