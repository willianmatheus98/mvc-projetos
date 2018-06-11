package br.edu.unichristus.mvcprojetos.dados.services;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.unichristus.mvcprojetos.dados.entidades.Projeto;
import br.edu.unichristus.mvcprojetos.dados.repositories.ProjetosRepository;

@Service
public class ProjetosService {
	@Autowired
	private ProjetosRepository repo;

	private List<Projeto> projetos = new LinkedList<>();
	
	public void salvar(Projeto p) {
		System.out.println("GRAVANDO O PROJETO " + p.getNome());
		this.repo.save(p);
	}

	public List<Projeto> buscarTodos() {
		return this.repo.findAll();
	}

	public Projeto buscar(Long idProjeto) {
		return this.projetos.stream().filter(p -> {
			return p.getIdProjeto().equals(idProjeto);
		}).collect(Collectors.toList()).get(0);
	}

}
