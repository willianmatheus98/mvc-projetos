package br.edu.unichristus.mvcprojetos.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/projeto")
public class ProjetosController {
	@RequestMapping("/adicionar")
	public String adicionarProjeto() {
		return "adicionarProjeto";
	}
}