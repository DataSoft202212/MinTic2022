package com.datasoft.mintic.sistemacontable.service;

import com.datasoft.mintic.sistemacontable.entity.Empresa;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmpresaService implements IEmpresaService {


    @Override
    public Empresa findById(long id) {
        Empresa EnterpriseOne = new Empresa(id,1075212588,"ByGsistemas","cali",601234356,"bygsistemas@gmail.com");
        return EnterpriseOne;
    }

    @Override
    public List<Empresa> findAll() {
        List<Empresa> compañia = new ArrayList<Empresa>();
        Empresa emp1 = new Empresa(01,1076543234,"coopetrol","bogota",6784523,"coopetrol@yahoo.com");
        compañia.add(emp1);
        Empresa emp2 = new Empresa(02,1076524234,"ventasneiva","neiva",6712523,"ventasneiva@yahoo");
        compañia.add(emp2);
        return compañia;
    }

    @Override
    public Empresa createEmpresa(Empresa empresa) {
        Empresa empresaNew = new Empresa(empresa.getIdEmpresa(), empresa.getNitEmpresa(), empresa.getRazonSocialEmpresa(), empresa.getDirEmpresa(), empresa.getTelEmpresa(), empresa.getEmailEmpresa());
        return empresaNew;
    }

    @Override
    public Empresa updateEmpresa(long id, Empresa empresa) {
        Empresa putEmpresa = findById(id);
        putEmpresa.setNitEmpresa(empresa.getNitEmpresa());
        putEmpresa.setRazonSocialEmpresa(empresa.getRazonSocialEmpresa());
        putEmpresa.setDirEmpresa(empresa.getDirEmpresa());
        putEmpresa.setTelEmpresa(empresa.getTelEmpresa());
        putEmpresa.setEmailEmpresa(empresa.getEmailEmpresa());
        return putEmpresa;
    }

    @Override
    public void deleteEmpresa(long id) {
        Empresa delempresa = findById(id);

    }
}
