package br.edu.unichristus.mvcprojetos.dados.entidades;

import java.math.BigDecimal;
import java.util.Arrays;

public class Recurso {
	private Long idRecurso;
	private String nome;
	private String tipo;
	private BigDecimal custo;
	private String unidadeMedida;
	private String[] indicadores;
	private String notas;

	// GETS e SETS
	public Long getIdRecurso() {
		return idRecurso;
	}

	public void setIdRecurso(Long idRecurso) {
		this.idRecurso = idRecurso;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public BigDecimal getCusto() {
		return custo;
	}

	public void setCusto(BigDecimal custo) {
		this.custo = custo;
	}

	public String getUnidadeMedida() {
		return unidadeMedida;
	}

	public void setUnidadeMedida(String unidadeMedida) {
		this.unidadeMedida = unidadeMedida;
	}

	public String[] getIndicadores() {
		return indicadores;
	}

	public void setIndicadores(String[] indicadores) {
		this.indicadores = indicadores;
	}

	public String getNotas() {
		return notas;
	}

	public void setNotas(String notas) {
		this.notas = notas;
	}

	@Override
	public String toString() {
		return "Recurso [id Recurso=" + idRecurso + ", nome=" + nome + ", tipo=" + tipo + ", custo=" + custo
				+ ", unidade de medida=" + unidadeMedida + ", indicadores=" + Arrays.toString(indicadores) + "]";
	}

}