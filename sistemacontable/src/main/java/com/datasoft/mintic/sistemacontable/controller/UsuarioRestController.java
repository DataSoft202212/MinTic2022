package com.datasoft.mintic.sistemacontable.controller;

import com.datasoft.mintic.sistemacontable.entity.Rol;
import com.datasoft.mintic.sistemacontable.entity.TipoDocumento;
import com.datasoft.mintic.sistemacontable.entity.Usuario;
import com.datasoft.mintic.sistemacontable.service.IUsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class UsuarioRestController {

    @Autowired
    private IUsuarioService iUsuarioService;

    @GetMapping("/Usuario/{id}")
    public Usuario findById(@PathVariable long id){
        return iUsuarioService.findById(id);
    }

    //Metodo Get -> Busqueda de todos los objetos de mi clase
    @GetMapping("/Usuario")
    public List<Usuario> findAll(){
        return iUsuarioService.findAll();
    }

    @PostMapping("/Usuario")
    public Usuario createUsuario(@RequestBody Usuario usuario){
        return iUsuarioService.createUsuario(usuario);
    }

    @PutMapping("/Usuario/{id}")
    public Usuario updateUsuario (@PathVariable long id,@RequestBody Usuario usuario){
        return iUsuarioService.updateUsuario(id, usuario);
    }

    @DeleteMapping("/Usuario/{id}")
    public void deleteUsuario(@PathVariable long id){
        iUsuarioService.deleteUsuario(id);
    }
}
