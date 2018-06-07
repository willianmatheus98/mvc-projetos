package br.edu.unichristus.mvcprojetos.dados.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.unichristus.mvcprojetos.dados.entidades.Projeto;
import br.edu.unichristus.mvcprojetos.dados.repositories.ProjetosRepository;

@Service
public class ProjetosService {
	@Autowired
	private ProjetosRepository repo;
	
	public List<Projeto>buscarTodos() {
		return this.repo.findAll();
	}

}
