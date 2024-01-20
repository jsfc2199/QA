package com.example.demo.service;

import com.example.demo.entity.Usuario;
import com.example.demo.repository.UsuariosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UsuarioService {
    @Autowired
    private UsuariosRepository usuarioService;

    public Usuario createUser(Usuario usuario) {

        Optional<Usuario> userInBBDD = getOne(usuario.getIdentification());

        if(userInBBDD.isPresent()){
            return new Usuario();
        }
        usuarioService.save(usuario);
        return usuario;
    }

    public Optional<Usuario> getOne(String identification){
        return usuarioService.findByIdentification(identification);
    }

    public Optional<Usuario> getOneById(Long id){
        return usuarioService.findById(id);
    }
}
