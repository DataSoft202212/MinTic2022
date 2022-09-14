package com.datasoft.mintic.sistemacontable.controller;

import com.datasoft.mintic.sistemacontable.entity.*;
import com.datasoft.mintic.sistemacontable.service.IIngresoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/api")
public class IngresoRestController {

    @Autowired

    private IIngresoService iIngresoService;
    @GetMapping("/Ingreso/{id}")
    public Ingreso findById(@PathVariable long id){
       return iIngresoService.findById(id);
    }

    @GetMapping("/Ingreso")
    public List<Ingreso> findAll(){
        return iIngresoService.findAll();
    }

    @PostMapping("/Ingreso")
    public Ingreso createIngreso(@RequestBody Ingreso ingreso){
      return iIngresoService.createIngreso(ingreso);
    }

    @PutMapping("/Ingreso/{id}")
    public Ingreso updateIngreso (@PathVariable long id,@RequestBody Ingreso ingreso){
       return iIngresoService.updateIngreso(id, ingreso);
    }

    @DeleteMapping("/Ingreso/{id}")
    public void deleteIngreso(@PathVariable long id){

        iIngresoService.deleteIngreso(id);
    }

}
