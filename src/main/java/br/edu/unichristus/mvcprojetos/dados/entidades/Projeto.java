package br.edu.unichristus.mvcprojetos.dados.entidades;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
@Data
@Entity
@Table(name = "TB_PROJETOS")
public class Projeto {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idProjeto;

	private String nome;

	private String descricao;

	private String patrocinador;

	private BigDecimal horasAutorizadas;

	private BigDecimal fundosAutorizados;

	private String ano;

	private boolean especial;

	private String tipo;

	public Long getIdProjeto() {
		return idProjeto;
	}

	public void setIdProjeto(Long idProjeto) {
		this.idProjeto = idProjeto;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getPatrocinador() {
		return patrocinador;
	}

	public void setPatrocinador(String patrocinador) {
		this.patrocinador = patrocinador;
	}

	public BigDecimal getHorasAutorizadas() {
		return horasAutorizadas;
	}

	public void setHorasAutorizadas(BigDecimal horasAutorizadas) {
		this.horasAutorizadas = horasAutorizadas;
	}

	public BigDecimal getFundosAutorizados() {
		return fundosAutorizados;
	}

	public void setFundosAutorizados(BigDecimal fundosAutorizados) {
		this.fundosAutorizados = fundosAutorizados;
	}

	public String getAno() {
		return ano;
	}

	public void setAno(String ano) {
		this.ano = ano;
	}

	public boolean isEspecial() {
		return especial;
	}

	public void setEspecial(boolean especial) {
		this.especial = especial;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	// Getters e Setters
	
}
