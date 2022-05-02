package com.crud.democrud.controllers;


import com.crud.democrud.models.RolModel;
import com.crud.democrud.services.RolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

@CrossOrigin
@RestController
@RequestMapping("/rol")
public class RolController {
    
    @Autowired
    RolService RolService;

    @GetMapping(value ="/all")
    public ArrayList<RolModel> obtenerRoles() {
        return RolService.obtenerRoles();
    }

    @PostMapping()
    public RolModel guardarRol(@RequestBody RolModel rol) {
        return this.RolService.guardarRol(rol);
    }

    @GetMapping(path = "/{id}")
    public Optional<RolModel> obtenerRolPorId(@PathVariable("id") Long id) {
        return this.RolService.obtenerRolPorId(id);
    }



    @DeleteMapping(path = "/{id}")
    public String eliminarRol(@PathVariable("id") Long id) {
        boolean ok = this.RolService.eliminarRol(id);
        if (ok) {
            return "Se eliminó lor roles con id " + id;
        } else {
            return "No pudo eliminar " + id;
        }
    }
}
