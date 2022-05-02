package com.crud.democrud.models;



import java.util.ArrayList;

import javax.persistence.*;


@Entity
@Table(name = "rol")
public class RolModel{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Long id;
    private Boolean cajero;
    private Boolean consultor;
    private Boolean gerente;
    private Boolean vendedor;

    @ManyToOne()
    @JoinColumn(name = "Id")
    private RolModel rol;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Boolean getCajero() {
        return cajero;
    }

    public void setCajero(Boolean cajero) {
        this.cajero = cajero;
    }

    public Boolean getConsultor() {
        return consultor;
    }

    public void setConsultor(Boolean consultor) {
        this.consultor = consultor;
    }

    public Boolean getGerente() {
        return gerente;
    }

    public void setGerente(Boolean gerente) {
        this.gerente = gerente;
    }

    public Boolean getVendedor() {
        return vendedor;
    }

    public void setVendedor(Boolean vendedor) {
        this.vendedor = vendedor;
    }


   
   
    public RolModel(Boolean cajero, Boolean consultor, Boolean vendedor, Boolean gerente) {
        this.cajero = cajero;
        this.consultor = consultor;
        this.gerente = gerente;
        this.vendedor = vendedor;
    }

    public RolModel() {

    }

    public static ArrayList<RolModel> findAll() {
        return null;
    }
    
    
}
