package com.datasoft.mintic.softcontable.service;

import com.datasoft.mintic.softcontable.entity.Usuario;

import java.util.List;

public interface IUsuarioService {
    public Usuario findById(long id);

    public List<Usuario> findAll();

    public Usuario createUsuario(Usuario usuario);

    public Usuario updateUsuario(long id, Usuario usuario);

    public void deleteUsuario(long id);
}
