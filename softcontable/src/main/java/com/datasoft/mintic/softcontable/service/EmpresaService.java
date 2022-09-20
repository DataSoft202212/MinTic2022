package com.datasoft.mintic.softcontable.service;

import com.datasoft.mintic.softcontable.entity.Empresa;
import com.datasoft.mintic.softcontable.repository.IEmpresaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmpresaService implements IEmpresaService {
    @Autowired
    private IEmpresaRepository empresaRepository;


    @Override
    public Empresa findById(long id) {
        Optional<Empresa> EnterpriseOne = empresaRepository.findById(id);
        return EnterpriseOne.get();
    }

    @Override
    public List<Empresa> findAll() {
        List<Empresa> compañia = (List<Empresa>) empresaRepository.findAll();
        return compañia;
    }

    @Override
    public Empresa createEmpresa(Empresa empresa) {
        Empresa empresaNew = empresaRepository.save(empresa);
        return empresaNew;
    }

    @Override
    public Empresa updateEmpresa(long id, Empresa empresa) {
        Empresa putEmpresa = empresaRepository.save(empresa);
        return putEmpresa;
    }

    @Override
    public void deleteEmpresa(long id) {
        empresaRepository.deleteById(id);

    }
}
