package br.edu.unichristus.mvcprojetos.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.edu.unichristus.mvcprojetos.dados.entidades.Projeto;
import br.edu.unichristus.mvcprojetos.dados.entidades.Recurso;
import br.edu.unichristus.mvcprojetos.dados.services.ProjetosService;

@Controller
@RequestMapping("/projeto")
public class ProjetosController {

	@Autowired
	private ProjetosService servico;

	@RequestMapping(value = "/adicionar", method = RequestMethod.GET)
	// Exibe o formulário para adicionar um projeto
	public String adicionarProjeto() {
		System.out.println("Invocando o formulário via GET");
		return "adicionarProjeto";
	}

	@RequestMapping(value = "/adicionar", method = RequestMethod.POST)
	// Salvar um projeto
	public String salvarProjeto(Model modelo, @ModelAttribute Projeto projeto) {
		System.out.println("Invocando o formulário via POST");
		modelo.addAttribute("msgsucesso", "Projeto adicionado com sucesso!");
		modelo.addAttribute("sucesso", true);
		modelo.addAttribute("projeto", new Projeto());
		return "adicionarProjeto";
	}

	@RequestMapping(value = "/adicionar", method = RequestMethod.POST, params = { "tipo=multi" })
	public String salvarProjetoMultiplosAnos() {
		System.out.println("invocando salvar projeto múltiplos anos");
		return "adicionarProjeto";
	}

	@RequestMapping(value = "/adicionar", method = RequestMethod.POST, params = { "tipo=multi", "especial" })
	public String salvarProjetoMultiplosAnosEspecial() {
		System.out.println("invocando salvar projeto múltiplos anos e especial");
		return "adicionarProjeto";
	}

	@RequestMapping(value = "/buscar")
	public String buscarTodos(Model modelo) {
		List<Projeto> projetos = this.servico.buscarTodos();
		modelo.addAttribute("projetos", projetos);
		return "projetos";
	}

	@RequestMapping(value = "/{idProjeto}")
	public String buscarProjeto(Model modelo, @PathVariable Long idProjeto) {
		modelo.addAttribute("projeto", this.servico.buscar(idProjeto));
		return "projeto";
	}

}
