package com.datasoft.mintic.softcontable.Controller;

import com.datasoft.mintic.softcontable.entity.*;
import com.datasoft.mintic.softcontable.service.IEgresoService;
import com.datasoft.mintic.softcontable.service.IEmpresaService;
import com.datasoft.mintic.softcontable.service.IIngresoService;
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

        double sumaEgreso = 0;
        double sumaIngreso = 0;

        List<Ingreso> ingresoList = ingresoService.findAll();
        modeloListMovFinan.addAttribute("listIngreso",ingresoList);

        List<Egreso> EgresoList = egresoService.findAll();
        modeloListMovFinan.addAttribute("listEgreso",EgresoList);


        for (Egreso egreso: EgresoList){
            sumaEgreso = sumaEgreso + egreso.getValorEgreso();
            System.out.println(sumaEgreso);
        }

        for (Ingreso ingreso: ingresoList){
            sumaIngreso = sumaIngreso + ingreso.getValorIngreso();
            System.out.println(sumaIngreso);
        }

        modeloListMovFinan.addAttribute("totalEgreso",sumaEgreso);
        modeloListMovFinan.addAttribute("totalIngreso",sumaIngreso);

        List<Usuario> listUser = usuarioService.findAll();
        modeloListMovFinan.addAttribute("listadoUsuario",listUser);

        List<Empresa> listempresa = empresaService.findAll();
        modeloListMovFinan.addAttribute("empresas",listempresa);


        return "/RegistroFinanciero/MovimientoFinanciero";
    }

    @GetMapping ("/RegistroFinanciero/Egreso")
    public String createEgreso (Model modelCreateEgreso){
        LOG.log(Level.INFO,"createEgreso");

        List<Empresa> listempresa = empresaService.findAll();
        modelCreateEgreso.addAttribute("empresas",listempresa);

        List<Usuario> listUser = usuarioService.findAll();
        modelCreateEgreso.addAttribute("listadoUsuario",listUser);


        Egreso newEgreso = new Egreso();
        newEgreso.setTipoMovDinero(TipoMovimiento.EGRESO);
        modelCreateEgreso.addAttribute("egreso",newEgreso);

        return "/RegistroFinanciero/Egreso";
    }

    @GetMapping ("/RegistroFinanciero/Ingreso")
    public String createIngreso (Model modelCreateIngreso){
        LOG.log(Level.INFO,"createIngreso");

        List<Empresa> listempresa = empresaService.findAll();
        modelCreateIngreso.addAttribute("empresas",listempresa);

        List<Usuario> listUser = usuarioService.findAll();
        modelCreateIngreso.addAttribute("listadoUsuario",listUser);


        Ingreso newIngreso = new Ingreso();
        newIngreso.setTipoMovDinero(TipoMovimiento.INGRESO);
        modelCreateIngreso.addAttribute("ingreso",newIngreso);

        return "/RegistroFinanciero/Ingreso";
    }

    @PostMapping("/nuevoEgreso")
    public String guardarEgreso(Egreso egreso){
        LOG.log(Level.INFO,"guardarEgreso");
        egreso = egresoService.createEgreso(egreso);
        return "redirect:/RegistroFinanciero/MovimientoFinanciero";
    }

    @PostMapping("/nuevoIngreso")
    public String guardarIngreso(Ingreso ingreso){
        LOG.log(Level.INFO,"guardarIngreso");
        ingreso = ingresoService.createIngreso(ingreso);
        return "redirect:/RegistroFinanciero/MovimientoFinanciero";
    }



}
