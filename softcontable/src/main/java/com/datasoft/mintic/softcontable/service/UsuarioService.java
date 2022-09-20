package com.datasoft.mintic.softcontable.service;

import com.datasoft.mintic.softcontable.entity.Usuario;
import com.datasoft.mintic.softcontable.repository.IUsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UsuarioService implements IUsuarioService {

    @Autowired
    private IUsuarioRepository iUsuarioRepository;

    @Override
    public Usuario findById(long id) {
        Optional<Usuario> userUno = iUsuarioRepository.findById(id);
        return userUno.get();
    }

    @Override
    public List<Usuario> findAll() {
        List<Usuario> userNeo = (List<Usuario>) iUsuarioRepository.findAll();
        return userNeo;
    }

    @Override
    public Usuario createUsuario(Usuario usuario) {
        Usuario userNew = iUsuarioRepository.save(usuario);
        return userNew;
    }

    @Override
    public Usuario updateUsuario(long id, Usuario usuario) {
        Usuario putUsuario = iUsuarioRepository.save(usuario);
        return putUsuario;
    }

    @Override
    public void deleteUsuario(long id) {

        iUsuarioRepository.deleteById(id);
    }
}
