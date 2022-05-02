package com.crud.democrud.ServicesTest;
import java.util.Optional;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;



import com.crud.democrud.models.RolModel;
import com.crud.democrud.repositories.RolRepository;

import static  org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
@AutoConfigureTestDatabase(replace= AutoConfigureTestDatabase.Replace.NONE)


public class RolServiceTest {
    @Autowired
    RolRepository RolRepository;

    @Test
    public void guardarRolTest(){
        RolModel RolModel=new RolModel(false,false,true,true);
        RolModel RolModelRegistrado = RolRepository.save(RolModel);
        assertNotNull(RolModelRegistrado);
    }

    @Test
    public void obtenerRolporIdTest(){
        Long idBuscado=1L;
        Optional<RolModel> rolModelBuscado=RolRepository.findById(idBuscado);
        assertThat(rolModelBuscado.get().getId()).isEqualTo(idBuscado);
    }


}
