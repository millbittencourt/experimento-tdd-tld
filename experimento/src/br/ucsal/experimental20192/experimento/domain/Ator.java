package br.ucsal.experimental20192.experimento.domain;

import br.ucsal.experimental20192.experimento.enums.GeneroEnum;

public class Ator {
	String nome;
	Integer anoNascimento;
	GeneroEnum genero;

	public Ator(String nome, Integer anoNascimento, GeneroEnum genero) {
		super();
		this.nome = nome;
		this.anoNascimento = anoNascimento;
		this.genero = genero;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getAnoNascimento() {
		return anoNascimento;
	}

	public void setAnoNascimento(Integer anoNascimento) {
		this.anoNascimento = anoNascimento;
	}

	public GeneroEnum getGenero() {
		return genero;
	}

	public void setGenero(GeneroEnum genero) {
		this.genero = genero;
	}
}
