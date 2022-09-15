package com.datasoft.mintic.sistemacontable.repository;

import com.datasoft.mintic.sistemacontable.entity.Empresa;
import org.springframework.data.repository.CrudRepository;

public interface IEmpresaRepository extends CrudRepository<Empresa,Long> {
}
