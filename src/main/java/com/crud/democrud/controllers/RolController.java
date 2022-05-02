package com.crud.democrud.controllers;

import com.crud.democrud.models.RolModel;
import com.crud.democrud.services.rolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;


@CrossOrigin
@RestController
@RequestMapping("/rols")
public class RolController {
    
    @Autowired
    rolService rolService;

    @GetMapping("/rol")
    public ArrayList<RolModel> obtenerRol() {
        return rolService.obtenerRol();
    }

    @PostMapping("/update/{id}")
    public RolModel guardarRol(@RequestBody RolModel rol) {
        return this.rolService.guardarRol(rol);
    }

    @GetMapping(path = "/{id}")
    public Optional<RolModel> obtenerRolPorId(@PathVariable("id") Long id) {
        return this.rolService.obtenerPorId(id);
    }

    
    
}
