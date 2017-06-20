package br.ufrn.apoo.garbagego.domain;

public class Coletor {
	private Double capacidadeAtual;
	
	private Localizacao localizacao;

	public Double getCapacidadeAtual() {
		return capacidadeAtual;
	}

	public void setCapacidadeAtual(Double capacidadeAtual) {
		this.capacidadeAtual = capacidadeAtual;
	}

	public Localizacao getLocalizacao() {
		return localizacao;
	}

	public void setLocalizacao(Localizacao localizacao) {
		this.localizacao = localizacao;
	}
}
