package br.com.etechoracio.feriadoapi.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.etechoracio.feriadoapi.model.FeriadoModel;

public interface FeriadoDAO extends JpaRepository<FeriadoModel, Long> {
	


}
