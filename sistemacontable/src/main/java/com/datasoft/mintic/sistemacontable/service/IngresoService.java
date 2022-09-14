package com.datasoft.mintic.sistemacontable.service;


import com.datasoft.mintic.sistemacontable.entity.*;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class IngresoService implements IIngresoService {

    public Ingreso findById(long id){
        Ingreso entradaUno = new Ingreso(id, TipoMovimiento.INGRESO,new Usuario(1,new TipoDocumento(001,"Cedula Ciudadania","CC",true),"10752341223","Carlos","perez","popayan",603134567,"cperez@hotmail.com",new Rol(0001,"Operario",true),"1q2w3e4r5t",true),new Empresa(01,900234567,"E-comercio","cali",87612345,"e.comercio@hotmail.com"),001,new Date(),450000,"pago administracion pagina");
        return entradaUno;
    }

    public List<Ingreso> findAll(){
        List<Ingreso> nuevoIng = new ArrayList<Ingreso>();
        Ingreso ingresoUno = new Ingreso(001,TipoMovimiento.INGRESO,new Usuario(1,new TipoDocumento(001,"Cedula Ciudadania","CC",true),"10752341223","Carlos","perez","popayan",603134567,"cperez@hotmail.com",new Rol(0001,"Operario",true),"1q2w3e4r5t",true),new Empresa(01,900134567,"E-comercio","cali",87612345,"e.comercio@hotmail.com"),001,new Date(),450000,"pago administracion pagina");
        nuevoIng.add(ingresoUno);
        Ingreso ingresoDos = new Ingreso(002,TipoMovimiento.INGRESO,new Usuario(2,new TipoDocumento(001,"Tarjeta de identidad","TI",true),"10752341223","Juan","Cardona","Cali",603367567,"juanc@hotmail.com",new Rol(0001,"auxiliar",true),"1q2w3e4r5t",true),new Empresa(02,900454567,"restaranteJuanc","pasto",87672345,"restorance@hotmail.com"),002,new Date(),340000,"pago administracion pagina");
        nuevoIng.add(ingresoDos);
        return nuevoIng;
    }

    public Ingreso createIngreso(Ingreso ingreso){
        Ingreso ingresoNew = new Ingreso(ingreso.getIdIngreso(), ingreso.getTipoMovDinero(),ingreso.getUserMovDinero(),ingreso.getEmpresaMovDinero(),ingreso.getIdIngreso(),ingreso.getFechaIngreso(), ingreso.getValorIngreso(), ingreso.getConceptoIngreso());
        return ingresoNew;
    }

    public Ingreso updateIngreso (long id,Ingreso ingreso){
        Ingreso putIngreso = findById(id);
        putIngreso.setIdMovDinero(ingreso.getIdMovDinero());
        putIngreso.setTipoMovDinero(ingreso.getTipoMovDinero());
        putIngreso.setUserMovDinero(ingreso.getUserMovDinero());
        putIngreso.setEmpresaMovDinero(ingreso.getEmpresaMovDinero());
        putIngreso.setFechaIngreso(ingreso.getFechaIngreso());
        putIngreso.setValorIngreso(ingreso.getValorIngreso());
        putIngreso.setConceptoIngreso(ingreso.getConceptoIngreso());
        return putIngreso;
    }

    public void deleteIngreso(long id){

        Ingreso delIngreso = findById(id);
    }
}
