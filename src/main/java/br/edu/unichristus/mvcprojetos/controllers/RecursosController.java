package br.edu.unichristus.mvcprojetos.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

import br.edu.unichristus.mvcprojetos.dados.entidades.Recurso;

@Controller
@RequestMapping("/recurso")
public class RecursosController {
	@RequestMapping(value = "/adicionar", method = RequestMethod.GET)
	public String adicionarRecurso(Model modelo) {
		System.out.println("invocando adicionar recurso");
		modelo.addAttribute("recurso", new Recurso());
		return "adicionarRecurso";
	}

	@RequestMapping(value = "/adicionar", method = RequestMethod.POST)
	public String salvarRecurso(Model modelo, @ModelAttribute Recurso recurso) {
		System.out.println("invocando salvar recurso");
		System.out.println(recurso);
		modelo.addAttribute("msgsucesso", "Recurso adicionado com sucesso!");
		modelo.addAttribute("sucesso", true);
		modelo.addAttribute("recurso", new Recurso());
		return "adicionarRecurso";
	}

	@ModelAttribute
	public void adicionarAtributos(Model modelo) {
		List<String> opcoes = new LinkedList<>(
				Arrays.asList(new String[] { "Material", "Outros", "Staff", "Equipamento Técnico" }));
		modelo.addAttribute("tipos", opcoes);
		List<String> radios = new LinkedList<>(Arrays.asList(new String[] { "Horas", "Pedaços", "Toneladas" }));
		modelo.addAttribute("opcoesRadio", radios);
		List<String> checks = new LinkedList<>(
				Arrays.asList(new String[] { "Tempo de Espera", "Taxa Especial", "Requer Aprovação" }));
		modelo.addAttribute("opcoesCheck", checks);
	}

}
