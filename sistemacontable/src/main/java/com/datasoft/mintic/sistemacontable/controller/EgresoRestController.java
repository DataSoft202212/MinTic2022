package com.datasoft.mintic.sistemacontable.controller;

import com.datasoft.mintic.sistemacontable.entity.*;
import com.datasoft.mintic.sistemacontable.service.IEgresoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/api")
public class EgresoRestController {

    @Autowired
    private IEgresoService iEgresoService;

    @GetMapping("/Egreso/{id}")
    public Egreso findById(@PathVariable long id){
        return iEgresoService.findById(id);
    }

    @GetMapping("/Egreso")
    public List<Egreso> findAll(){
       return iEgresoService.findAll();
    }

    @PostMapping("/Egreso")
    public Egreso createEgreso (@RequestBody Egreso egreso){
       return iEgresoService.createEgreso(egreso);
    }

    @PutMapping("/Egreso/{id}")
    public Egreso updateEgreso (@PathVariable long id,@RequestBody Egreso egreso){
       return iEgresoService.updateEgreso(id, egreso);
    }

    @DeleteMapping("/Egreso/{id}")
    public void deleteEgreso(@PathVariable long id){
        iEgresoService.deleteEgreso(id);
    }

}
