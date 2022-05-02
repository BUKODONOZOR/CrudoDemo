package com.crud.democrud.models;

import java.io.Serializable;

import javax.persistence.*;

@Entity 
@Table(name = "roles")
public class RolModel implements Serializable {

    private static final long serialVersionUID = 1L;
   
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Boolean vendedor;
    private Boolean consultor;
    private Boolean cajero;
    private Boolean repartidor;
    private Boolean gerente;

    @OneToOne()
    private UsuarioModel usuario; 

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public Boolean getVendedor() {
        return vendedor;
    }
    public void setVendedor(Boolean vendedor) {
        this.vendedor = vendedor;
    }
    public Boolean getConsultor() {
        return consultor;
    }
    public void setConsultor(Boolean consultor) {
        this.consultor = consultor;
    }
    public Boolean getCajero() {
        return cajero;
    }
    public void setCajero(Boolean cajero) {
        this.cajero = cajero;
    }
    public Boolean getRepartidor() {
        return repartidor;
    }
    public void setRepartidor(Boolean repartidor) {
        this.repartidor = repartidor;
    }
    public Boolean getGerente() {
        return gerente;
    }
    public void setGerente(Boolean gerente) {
        this.gerente = gerente;
    }

    public RolModel(Boolean cajero, Boolean vendedor, Boolean repartidor, Boolean gerente, Boolean consultor) {
        this.cajero = cajero;
        this.vendedor = vendedor;
        this.repartidor = repartidor;
        this.gerente = gerente; 
        this.consultor = consultor;

    }

    public RolModel() {

    }

    
    
}
