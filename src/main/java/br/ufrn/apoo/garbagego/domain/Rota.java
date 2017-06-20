package br.ufrn.apoo.garbagego.domain;

import java.util.LinkedList;
import java.util.Queue;

public class Rota {
	private Queue<String> listaDasRuas;
	
	public Rota() {
		this.listaDasRuas = new LinkedList<>();
	}

	public Queue<String> getListaDasRuas() {
		return listaDasRuas;
	}

	public void setListaDasRuas(Queue<String> listaDasRuas) {
		this.listaDasRuas = listaDasRuas;
	}
}
