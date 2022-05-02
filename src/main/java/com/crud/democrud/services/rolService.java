package com.crud.democrud.services;

import java.util.ArrayList;
import java.util.Optional;

import com.crud.democrud.models.RolModel;
import com.crud.democrud.repositories.RolRepository;

import org.springframework.beans.factory.annotation.Autowired;

public class rolService {

    @Autowired
    RolRepository RolRepository;
    
    public ArrayList<RolModel> obtenerRol(){
        return (ArrayList<RolModel>) RolRepository.findAll();
    }

    public RolModel guardarRol(RolModel rol){
        return RolRepository.save(rol);
    }

    public Optional<RolModel> obtenerPorId(Long id){
        return RolRepository.findById(id);
    }


}


