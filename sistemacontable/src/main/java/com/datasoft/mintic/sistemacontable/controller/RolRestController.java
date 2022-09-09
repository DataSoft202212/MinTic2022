package com.datasoft.mintic.sistemacontable.controller;

import com.datasoft.mintic.sistemacontable.entity.Rol;
import com.datasoft.mintic.sistemacontable.service.IRolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;


@RestController
//Ruta de nuestro controlador Rol
@RequestMapping("/api")
public class RolRestController {

    @Autowired
    private IRolService rolService;

    //Metodo Get -> busqueda por id, en nuestra ruta debemos agregar el id
    @GetMapping("/rol/{id}")
    public Rol findById (@PathVariable long id){
        return rolService.findById(id);
    }

    //Metodo Get -> Busqueda de todos los objetos de mi clase
    @GetMapping("/rol")
    public List<Rol> findAll(){
        return rolService.findAll();
    }

    //Crear un rol
    @PostMapping("/rol")
    public Rol createRol (@RequestBody Rol rol){
        return rolService.createRol(rol);
    }

    @PutMapping("/rol/{id}")
    public Rol updateRol (@PathVariable long id, @RequestBody Rol rol) {
        return rolService.updateRol(id, rol);
    }
    @DeleteMapping("/rol/{id}")
    public void deleteRol(@PathVariable long id){

        rolService.deleteRol(id);
    }

}
