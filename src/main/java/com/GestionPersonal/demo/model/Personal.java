package com.GestionPersonal.demo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "personal")
public class Personal {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idpersonal")
    private Integer idpersonal;
    
    @Column(name = "nombrePersonal")
    private String nombrePersonal;
    
    @Column(name = "codigoPersonal")
    private Integer codigoPersonal;
    
    @Column(name = "areaTrabajo")
    private String areaTrabajo;
    
    @Column(name = "especialidad")
    private String especialidad;
    
    @Column(name = "tiempoServicio")
    private String tiempoServicio;
    
    @Column(name = "tipoSeguro")
    private String tipoSeguro;

    @ManyToOne
    @JoinColumn(name = "idempresa") 
    private Empresa empresa;

	public Integer getIdpersonal() {
		return idpersonal;
	}

	public void setIdpersonal(Integer idpersonal) {
		this.idpersonal = idpersonal;
	}

	public String getNombrePersonal() {
		return nombrePersonal;
	}

	public void setNombrePersonal(String nombrePersonal) {
		this.nombrePersonal = nombrePersonal;
	}

	public Integer getCodigoPersonal() {
		return codigoPersonal;
	}

	public void setCodigoPersonal(Integer codigoPersonal) {
		this.codigoPersonal = codigoPersonal;
	}

	public String getAreaTrabajo() {
		return areaTrabajo;
	}

	public void setAreaTrabajo(String areaTrabajo) {
		this.areaTrabajo = areaTrabajo;
	}

	public String getEspecialidad() {
		return especialidad;
	}

	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}

	public String getTiempoServicio() {
		return tiempoServicio;
	}

	public void setTiempoServicio(String tiempoServicio) {
		this.tiempoServicio = tiempoServicio;
	}

	public String getTipoSeguro() {
		return tipoSeguro;
	}

	public void setTipoSeguro(String tipoSeguro) {
		this.tipoSeguro = tipoSeguro;
	}

	public Empresa getEmpresa() {
		return empresa;
	}

	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}

    
}