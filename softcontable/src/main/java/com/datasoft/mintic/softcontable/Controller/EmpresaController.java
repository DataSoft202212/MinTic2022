package com.datasoft.mintic.softcontable.Controller;

import com.datasoft.mintic.softcontable.entity.Empresa;
import com.datasoft.mintic.softcontable.service.IEmpresaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
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
        System.out.println(enterprise.toString());
        enterprise = empresaService.createEmpresa(enterprise);
        return "redirect:/Empresa/listempresa";
    }

}
