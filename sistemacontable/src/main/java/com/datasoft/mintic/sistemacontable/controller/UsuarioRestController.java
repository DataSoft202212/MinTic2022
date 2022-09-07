package com.datasoft.mintic.sistemacontable.controller;

import com.datasoft.mintic.sistemacontable.entity.Rol;
import com.datasoft.mintic.sistemacontable.entity.TipoDocumento;
import com.datasoft.mintic.sistemacontable.entity.Usuario;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class UsuarioRestController {

    @GetMapping("/Usuario/{id}")
    public Usuario findById(@PathVariable long id){
        Usuario userUno = new Usuario(id,new TipoDocumento(001,"Cedula Ciudadania","CC",true),"10752341223","Carlos","perez","popayan",603134567,"cperez@hotmail.com",new Rol(0001,"Operario",true),"1q2w3e4r5t",true);
        return userUno;

    }

    //Metodo Get -> Busqueda de todos los objetos de mi clase
    @GetMapping("/Usuario")
    public List<Usuario> findAll(){
        List<Usuario> userNeo = new ArrayList<Usuario>();
        Usuario user1 = new Usuario(011,new TipoDocumento(10,"cedula","CC",true),"10765431234","marcos","garrido","popayan",8234567,"marcos@gmail.com",new Rol(21,"Operador",true),"1q2w3e4r5t",true);
        userNeo.add(user1);
        Usuario user2 = new Usuario(015,new TipoDocumento(11,"nit","NIT",true),"10765343131","maria","gutierrez","cali",7564567,"maria@gmail.com",new Rol(22,"Administrador",true),"1q2w3e4r5t",true);
        userNeo.add(user2);
        return userNeo;
    }

    @PostMapping("/Usuario")
    public Usuario createUsuario(@RequestBody Usuario usuario){
        Usuario userNew = new Usuario(usuario.getIdUsuario(),usuario.getTipoDocumento(), usuario.getNroIdentificacion(), usuario.getNombreUsuario(), usuario.getApellidoUsuario(), usuario.getDirUsuario(), usuario.getTelUsuario(), usuario.getEmailUsuario(), usuario.getRolUsuario(), usuario.getPassUsuario(), usuario.isEstadoUsuario());
        return userNew;
    }

    @PutMapping("/Usuario/{id}")
    public Usuario updateUsuario (@PathVariable long id,@RequestBody Usuario usuario){
        Usuario putUsuario = findById(id);
        putUsuario.setTipoDocumento(usuario.getTipoDocumento());
        putUsuario.setNroIdentificacion(usuario.getNroIdentificacion());
        putUsuario.setNombreUsuario(usuario.getNombreUsuario());
        putUsuario.setApellidoUsuario(usuario.getApellidoUsuario());
        putUsuario.setDirUsuario(usuario.getDirUsuario());
        putUsuario.setTelUsuario(usuario.getTelUsuario());
        putUsuario.setEmailUsuario(usuario.getEmailUsuario());
        putUsuario.setRolUsuario(usuario.getRolUsuario());
        putUsuario.setPassUsuario(usuario.getPassUsuario());
        putUsuario.setEstadoUsuario(usuario.isEstadoUsuario());
        return putUsuario;

    }

    @DeleteMapping("/Usuario/{id}")
    public void deleteUsuario(@PathVariable long id){
        Usuario delUsuario = findById(id);
    }
}
