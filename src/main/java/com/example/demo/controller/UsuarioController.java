package com.example.demo.controller;

import com.example.demo.entity.Usuario;
import com.example.demo.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("api/")
public class UsuarioController {

    @Autowired
    private UsuarioService service;

    @PostMapping("create/user")
    public Usuario createUser(@RequestBody Usuario usuario) throws Exception {
        return service.createUser(usuario);
    }

    @GetMapping("getOne/user")
    public Optional<Usuario> getUser(@RequestParam String identification){
        return service.getOne(identification);
    }

    @GetMapping("getOneById/user")
    public Optional<Usuario> getUser(@RequestParam Long id){
        return service.getOneById(id);
    }
}
