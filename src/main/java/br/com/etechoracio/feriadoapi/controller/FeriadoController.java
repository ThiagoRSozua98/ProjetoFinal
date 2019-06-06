package br.com.etechoracio.feriadoapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.etechoracio.feriadoapi.dao.FeriadoDAO;
import br.com.etechoracio.feriadoapi.model.FeriadoModel;

@RestController
@RequestMapping("/feriados")
public class FeriadoController {
	
	@Autowired
	private FeriadoDAO dao;
	
	@GetMapping
	public List<FeriadoModel> findAll() {
		return dao.findAll();
					
	}
	
}
