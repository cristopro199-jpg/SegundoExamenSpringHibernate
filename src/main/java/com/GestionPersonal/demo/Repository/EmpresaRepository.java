package com.GestionPersonal.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.GestionPersonal.demo.model.Empresa;

@Repository
public interface EmpresaRepository extends JpaRepository<Empresa, Integer> {
	
}
