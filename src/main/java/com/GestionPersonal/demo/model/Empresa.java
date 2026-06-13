package com.GestionPersonal.demo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "empresa")
public class Empresa {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idempresa")
    private Integer idempresa;
    
    @Column(name = "nombreEmpresa")
    private String nombreEmpresa;
    
    @Column(name = "codigoEmpresa")
    private String codigoEmpresa;
    
    @Column(name = "areaEmpresa")
    private String areaEmpresa;

	public Integer getIdempresa() {
		return idempresa;
	}

	public void setIdempresa(Integer idempresa) {
		this.idempresa = idempresa;
	}

	public String getNombreEmpresa() {
		return nombreEmpresa;
	}

	public void setNombreEmpresa(String nombreEmpresa) {
		this.nombreEmpresa = nombreEmpresa;
	}

	public String getCodigoEmpresa() {
		return codigoEmpresa;
	}

	public void setCodigoEmpresa(String codigoEmpresa) {
		this.codigoEmpresa = codigoEmpresa;
	}

	public String getAreaEmpresa() {
		return areaEmpresa;
	}

	public void setAreaEmpresa(String areaEmpresa) {
		this.areaEmpresa = areaEmpresa;
	}

    
}
