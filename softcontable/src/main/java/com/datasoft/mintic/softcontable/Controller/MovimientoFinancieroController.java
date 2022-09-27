package com.datasoft.mintic.softcontable.Controller;

import com.datasoft.mintic.softcontable.entity.Egreso;
import com.datasoft.mintic.softcontable.entity.Empresa;
import com.datasoft.mintic.softcontable.entity.Ingreso;
import com.datasoft.mintic.softcontable.entity.Usuario;
import com.datasoft.mintic.softcontable.service.IEgresoService;
import com.datasoft.mintic.softcontable.service.IEmpresaService;
import com.datasoft.mintic.softcontable.service.IIngresoService;
import com.datasoft.mintic.softcontable.service.IUsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

@Controller
public class MovimientoFinancieroController {

    @Autowired
    private IEgresoService egresoService;

    @Autowired
    private IIngresoService ingresoService;

    @Autowired
    private IUsuarioService usuarioService;

    @Autowired
    private IEmpresaService empresaService;

    private final Logger LOG = Logger.getLogger("" + MovimientoFinancieroController.class);

    @GetMapping ("/RegistroFinanciero/MovimientoFinanciero")
    public String listMovFinanciero (Model modeloListMovFinan){

        LOG.log(Level.INFO,"listMovFinanciero");

        List<Ingreso> ingresoList = ingresoService.findAll();
        modeloListMovFinan.addAttribute("listIngreso",ingresoList);

        List<Egreso> EgresoList = egresoService.findAll();
        modeloListMovFinan.addAttribute("listEgreso",EgresoList);
        

        List<Usuario> listUser = usuarioService.findAll();
        modeloListMovFinan.addAttribute("listadoUsuario",listUser);

        List<Empresa> listempresa = empresaService.findAll();
        modeloListMovFinan.addAttribute("empresas",listempresa);

        return "/RegistroFinanciero/MovimientoFinanciero";
    }




}
