package com.crud.democrud.services;
import com.crud.democrud.models.RolModel;
import com.crud.democrud.repositories.RolRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class RolService {

    @Autowired
    RolRepository RolRepository;
    
    public ArrayList<RolModel> obtenerRoles(){
        return (ArrayList<RolModel>) RolRepository.findAll();
    }

    public RolModel guardarRol(RolModel rol){
        return RolRepository.save(rol);
    }

    public Optional<RolModel> obtenerRolPorId(Long id){
        return RolRepository.findById(id);
    }



    public boolean eliminarRol(Long id) {
        try{
            RolRepository.deleteById(id);
            return true;
        }catch(Exception err){
            return false;
        }
    }
    
}
