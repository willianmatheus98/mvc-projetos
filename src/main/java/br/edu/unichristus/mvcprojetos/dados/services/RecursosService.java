package br.edu.unichristus.mvcprojetos.dados.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.unichristus.mvcprojetos.dados.entidades.Recurso;
import br.edu.unichristus.mvcprojetos.dados.repositories.RecursosRepository;


@Service
public class RecursosService {

	@Autowired
	public RecursosRepository repo;
	
	public void salvar(Recurso r) {
		System.out.println("GRAVANDO O RECURSO " + r.getNome());
		this.repo.save(r);
	}
	
}
