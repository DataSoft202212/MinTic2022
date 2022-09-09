package com.datasoft.mintic.sistemacontable.controller;

import com.datasoft.mintic.sistemacontable.entity.Empresa;
import com.datasoft.mintic.sistemacontable.entity.Rol;
import com.datasoft.mintic.sistemacontable.service.IEmpresaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class EmpresaRestController {

    @Autowired
    private IEmpresaService iEmpresaService;

    @GetMapping("/Empresa/{id}")
    public Empresa findById(@PathVariable long id){

        return iEmpresaService.findById(id);
    }

    //Metodo Get -> Busqueda de todos los objetos de mi clase
    @GetMapping("/Empresa")
    public List<Empresa> findAll(){

        return iEmpresaService.findAll();
    }

    @PostMapping("/Empresa")
    public Empresa createEmpresa(@RequestBody Empresa empresa){

        return iEmpresaService.createEmpresa(empresa);
    }

    @PutMapping("/Empresa/{id}")
    public Empresa updateEmpresa (@PathVariable long id,@RequestBody Empresa empresa){

        return iEmpresaService.updateEmpresa(id, empresa);
    }

    @DeleteMapping("/Empresa/{id}")
    public void deleteEmpresa(@PathVariable long id){

        iEmpresaService.deleteEmpresa(id);
    }
}
