package com.example.demo.service;

import com.example.demo.entity.Usuario;
import com.example.demo.repository.UsuariosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {
    @Autowired
    private UsuariosRepository usuarioService;

    public Usuario createUser(Usuario usuario){
        usuarioService.save(usuario);
        return usuario;
    }
}
