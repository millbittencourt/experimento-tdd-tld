package br.ucsal.experimental20192.cinemateca.domain;

import br.ucsal.experimental20192.cinemateca.enums.GeneroAtorEnum;

public class Ator {
	String nome;
	Integer anoNascimento;
	GeneroAtorEnum genero;

	public Ator(String nome, Integer anoNascimento, GeneroAtorEnum genero) {
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

	public GeneroAtorEnum getGenero() {
		return genero;
	}

	public void setGenero(GeneroAtorEnum genero) {
		this.genero = genero;
	}
}
