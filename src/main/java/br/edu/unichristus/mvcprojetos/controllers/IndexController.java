package br.edu.unichristus.mvcprojetos.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import br.edu.unichristus.mvcprojetos.dados.entidades.Projeto;

@Controller
public class IndexController {

	@RequestMapping("/")
	public String index(Model modelo) {
		Projeto p1 = new Projeto();
		p1.setNome("Projeto NASA Espacial");
		p1.setDescricao("Projeto para Construção de Nave");
		p1.setPatrocinador("NASA");
		modelo.addAttribute("projeto1", p1);
		return "index";
	}
}
