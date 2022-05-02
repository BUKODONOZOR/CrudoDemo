package com.crud.democrud.repositories;



import java.util.ArrayList;

import com.crud.democrud.models.RolModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RolRepository extends CrudRepository<RolModel, Long> {
    public abstract ArrayList<RolModel> findByPrioridad(Integer prioridad);
   

}