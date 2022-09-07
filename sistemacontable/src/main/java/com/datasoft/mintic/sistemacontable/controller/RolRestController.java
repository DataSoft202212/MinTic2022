package com.datasoft.mintic.sistemacontable.controller;

import com.datasoft.mintic.sistemacontable.entity.Rol;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;


@RestController
//Ruta de nuestro controlador Rol
@RequestMapping("/api")
public class RolRestController {

    //Metodo Get -> busqueda por id, en nuestra ruta debemos agregar el id
    @GetMapping("/rol/{id}")
    public Rol findById (@PathVariable long id){
        Rol rol1 = new Rol(id,"Administrador",true);
        return rol1;
    }

    //Metodo Get -> Busqueda de todos los objetos de mi clase
    @GetMapping("/rol")
    public List<Rol> findAll(){
        List<Rol> roles = new ArrayList<Rol>();
        Rol rol1 = new Rol(1,"Administrador",true);
        roles.add(rol1);
        Rol rol2 = new Rol(2,"Operador",true);
        roles.add(rol2);
        return roles;
    }

    //Crear un rol
    @PostMapping("/rol")
    public Rol createRol (@RequestBody Rol rol){
        Rol nuevoRol = new Rol(rol.getIdRol(),rol.getDescripcionRol(),rol.isEstadoRol());
        return nuevoRol;
    }

    @PutMapping("/rol/{id}")
    public Rol updateRol (@PathVariable long id, @RequestBody Rol rol){
        Rol putRol = findById(id);
        putRol.setDescripcionRol(rol.getDescripcionRol());
        putRol.setEstadoRol(rol.isEstadoRol());
        return putRol;
    }

    @DeleteMapping("/rol/{id}")
    public void deleteRol(@PathVariable long id){
        Rol delRol = findById(id);
    }

}
