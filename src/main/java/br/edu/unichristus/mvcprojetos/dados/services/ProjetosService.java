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

	public ProjetosService() {
		Projeto projetoJava = this.criarProjeto(1L, "Projeto Java", "Este é um projeto Java");
		Projeto projetoJavascript = this.criarProjeto(2L, "Projeto JavaScript", "Este é um projeto JavaScript");
		Projeto projetoHTML = this.criarProjeto(3L, "Projeto HTML", "Este é um projeto HTML");
		this.projetos.addAll(Arrays.asList(new Projeto[] { projetoJava, projetoJavascript, projetoHTML }));
	}

	public List<Projeto> buscarTodos() {
		return this.repo.findAll();
	}

	private Projeto criarProjeto(Long idProjeto, String titulo, String descricao) {
		Projeto projeto = new Projeto();
		projeto.setNome(titulo);
		// projeto.setPatrocinador(“Patrocinador de projetos”);
		// projeto.setFundosAutorizados(new BigDecimal("100000"));
		// projeto.setHorasAutorizadas(new BigDecimal("1000"));
		projeto.setIdProjeto(idProjeto);
		projeto.setEspecial(false);
		projeto.setTipo("multi");
		projeto.setAno("2015");
		projeto.setDescricao(descricao);
		return projeto;
	}

	public Projeto buscar(Long idProjeto) {
		return this.projetos.stream().filter(p -> {
			return p.getIdProjeto().equals(idProjeto);
		}).collect(Collectors.toList()).get(0);
	}

}
