package com.crud.democrud.repositories;

import com.crud.democrud.models.RolModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


import java.util.Optional;

@Repository
public interface RolRepository extends CrudRepository<RolModel, Long> {
    public abstract Optional<RolModel> findById(Long id);

}

