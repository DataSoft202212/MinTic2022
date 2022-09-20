package com.datasoft.mintic.softcontable.repository;

import com.datasoft.mintic.softcontable.entity.Usuario;
import org.springframework.data.repository.CrudRepository;

public interface IUsuarioRepository extends CrudRepository<Usuario, Long> {
}
