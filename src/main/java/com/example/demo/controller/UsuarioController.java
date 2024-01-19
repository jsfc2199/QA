package com.example.demo.controller;

import com.example.demo.entity.Usuario;
import com.example.demo.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/")
public class UsuarioController {

    @Autowired
    private UsuarioService service;

    @PostMapping("create/user")
    public Usuario createUser(@RequestBody Usuario usuario){
        return service.createUser(usuario);
    }
}
