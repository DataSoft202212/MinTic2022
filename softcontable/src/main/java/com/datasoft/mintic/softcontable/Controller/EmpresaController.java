package com.datasoft.mintic.softcontable.Controller;

import com.datasoft.mintic.softcontable.entity.Empresa;
import com.datasoft.mintic.softcontable.service.IEmpresaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

@Controller
public class EmpresaController {

    @Autowired
    private IEmpresaService empresaService;

    private final Logger LOG = Logger.getLogger("" + EmpresaController.class);

    @GetMapping("/Empresa/listempresa")
    public String getListEmpresa(Model modelEmpresa){
        LOG.log(Level.INFO,"getListEmpresa");

        List<Empresa> listEmpresa = empresaService.findAll();
        modelEmpresa.addAttribute("listadoempresa",listEmpresa);
        return "/Empresa/listempresa";
    }

    @GetMapping ("/Empresa/empresa")
    public String postnewenterprise(Model modelEmpresa){
        LOG.log(Level.INFO,"postnewenterprise");

        Empresa newEnterprise = new Empresa();
        modelEmpresa.addAttribute("empresa",newEnterprise);
        return "/Empresa/empresa";
    }

    @PostMapping("/nuevaempresa")
    public String guardarEmpresa(Empresa enterprise){
        LOG.log(Level.INFO,"guardarEmpresa");
        enterprise = empresaService.createEmpresa(enterprise);
        return "redirect:/Empresa/listempresa";
    }

    @GetMapping("/editEmpresa/{id}")
    public String editempresa(@PathVariable long id, Empresa empresa, Model modeleditarempresa){
        LOG.log(Level.INFO,"editempresa");
        Empresa editempresa = empresaService.findById(id);

        modeleditarempresa.addAttribute("empresa",editempresa);

        return "/Empresa/empresa";
    }

    @GetMapping("/delEmpresa/{id}")
    public String deleteEmpresa(@PathVariable long id, Empresa empresa, Model modelDelEmpresa){
        LOG.log(Level.INFO,"deleteEmpresa");
        empresaService.deleteEmpresa(id);

        return "redirect:/Empresa/listempresa";
    }


}
