package com.crud.democrud.ControllerServiceTest;



import com.crud.democrud.repositories.RolRepository;
import com.crud.democrud.services.RolService;

import org.junit.jupiter.api.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;


import java.util.ArrayList;


import static org.assertj.core.api.Assertions.assertThat;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;


@SpringBootTest
public class RolServiceMockTest {

  @MockBean
  RolRepository RolRepository;

  @Autowired
  RolService RolService;

  @Test
  public void testUsuarioMock(){
    when(RolRepository.findAll()).thenReturn(new ArrayList<>());
    assertThat(RolService.obtenerRoles()).isEmpty();
    verify(RolRepository).findAll();
  }

}
