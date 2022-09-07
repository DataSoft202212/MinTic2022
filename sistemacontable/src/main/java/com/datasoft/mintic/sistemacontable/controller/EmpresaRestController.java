package com.datasoft.mintic.sistemacontable.controller;

import com.datasoft.mintic.sistemacontable.entity.Empresa;
import com.datasoft.mintic.sistemacontable.entity.Rol;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class EmpresaRestController {
    @GetMapping("/Empresa/{id}")
    public Empresa findById(@PathVariable long id){
        Empresa EnterpriseOne = new Empresa(id,1075212588,"ByGsistemas","cali",601234356,"bygsistemas@gmail.com");
        return EnterpriseOne;
    }

    //Metodo Get -> Busqueda de todos los objetos de mi clase
    @GetMapping("/Empresa")
    public List<Empresa> findAll(){
        List<Empresa> compañia = new ArrayList<Empresa>();
        Empresa emp1 = new Empresa(01,1076543234,"coopetrol","bogota",6784523,"coopetrol@yahoo.com");
        compañia.add(emp1);
        Empresa emp2 = new Empresa(02,1076524234,"ventasneiva","neiva",6712523,"ventasneiva@yahoo");
        compañia.add(emp2);
        return compañia;
    }

    @PostMapping("/Empresa")
    public Empresa createEmpresa(@RequestBody Empresa empresa){
        Empresa empresaNew = new Empresa(empresa.getIdEmpresa(), empresa.getNitEmpresa(), empresa.getRazonSocialEmpresa(), empresa.getDirEmpresa(), empresa.getTelEmpresa(), empresa.getEmailEmpresa());
        return empresaNew;
    }

    @PutMapping("/Empresa/{id}")
    public Empresa updateEmpresa (@PathVariable long id,@RequestBody Empresa empresa){
        Empresa putEmpresa = findById(id);
        putEmpresa.setNitEmpresa(empresa.getNitEmpresa());
        putEmpresa.setRazonSocialEmpresa(empresa.getRazonSocialEmpresa());
        putEmpresa.setDirEmpresa(empresa.getDirEmpresa());
        putEmpresa.setTelEmpresa(empresa.getTelEmpresa());
        putEmpresa.setEmailEmpresa(empresa.getEmailEmpresa());
        return putEmpresa;
    }

    @DeleteMapping("/Empresa/{id}")
    public void deleteEmpresa(@PathVariable long id){
        Empresa delempresa = findById(id);
    }
}
