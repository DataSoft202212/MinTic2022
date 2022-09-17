package com.datasoft.mintic.sistemacontable.repository;

import com.datasoft.mintic.sistemacontable.entity.Usuario;
import org.springframework.data.repository.CrudRepository;

public interface IUsuarioRepository extends CrudRepository<Usuario, Long> {
}
