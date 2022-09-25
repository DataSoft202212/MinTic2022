package com.datasoft.mintic.softcontable.Controller;


import com.datasoft.mintic.softcontable.entity.Empresa;
import com.datasoft.mintic.softcontable.entity.Rol;
import com.datasoft.mintic.softcontable.entity.TipoDocumento;
import com.datasoft.mintic.softcontable.entity.Usuario;
import com.datasoft.mintic.softcontable.service.IEmpresaService;
import com.datasoft.mintic.softcontable.service.IRolService;
import com.datasoft.mintic.softcontable.service.ITipoDocumentoService;
import com.datasoft.mintic.softcontable.service.IUsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

@Controller
public class UsuarioController {

    @Autowired
    private IUsuarioService usuarioService;

    @Autowired
    private IRolService rolService;

    @Autowired
    private ITipoDocumentoService tipoDocumentoService;

    @Autowired
    private IEmpresaService empresaService;

    private final Logger LOG = Logger.getLogger("" + UsuarioController.class);

    @GetMapping("/Usuario/listuser")
    public String getDirUsuario(Model model){
        LOG.log(Level.INFO,"getDirUsuario");

        List<Usuario> listUser = usuarioService.findAll();
        model.addAttribute("listadoUsuario",listUser);


        return "Usuario/listuser";
    }

    @GetMapping("/Usuario/usuario")
    public String postUsuario(Model postmodel ){
        LOG.log(Level.INFO,"postUsuario");

        //Usuario
        Usuario newUser = new Usuario();
        postmodel.addAttribute("usuarioNuevo",newUser);

        //Roles
        List<Rol> listRol = rolService.findAll();
        postmodel.addAttribute("roles",listRol);

        //Tipos Documentos
        List<TipoDocumento> listTipoDoc = tipoDocumentoService.findAll();
        postmodel.addAttribute("tipoDocumentos",listTipoDoc);

        //Empresas
        List<Empresa> listempresa = empresaService.findAll();
        postmodel.addAttribute("empresas",listempresa);

        return "Usuario/usuario";
    }

    @PostMapping("/nuevouser")
    public String guardarUser(Usuario user){
        LOG.log(Level.INFO,"guardarUser");
        user.setEstadoUsuario(true);
        System.out.println(user.toString());
        user = usuarioService.createUsuario(user);

        return "redirect:/Usuario/usuario";
    }

}
