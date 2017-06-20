package br.ufrn.apoo.garbagego.controllers;

import br.ufrn.apoo.garbagego.domain.Coletor;
import br.ufrn.apoo.garbagego.domain.Localizacao;
import br.ufrn.apoo.garbagego.exceptions.NegocioException;
import br.ufrn.apoo.garbagego.services.CRUDService;
import br.ufrn.apoo.garbagego.services.ColetorService;

public class ColetorMBEan implements CRUDController<Coletor>{
	
	/**
	 * Service do coletor
	 */
	private CRUDService<Coletor> coletorService;
	
	/**
	 * Objeto Coletor para uso no MBean
	 */
	private Coletor coletor;
	
	public ColetorMBEan() {
		this.inicializar();
	}
	
	/**
	 * Método para inicializar os atributos presentes no controller
	 */
	private void inicializar() {
		this.coletor = new Coletor();
		coletor.setCapacidadeAtual(new Double(0.0));
		
		Localizacao localizacao = new Localizacao();
		localizacao.setPosicaoX(new Double(0.0));
		localizacao.setPosicaoY(new Double(0.0));
		
		coletor.setLocalizacao(localizacao);
		
		this.coletorService = new ColetorService();
	}
	
	public Coletor getColetor() {
		return coletor;
	}

	public void setColetor(Coletor coletor) {
		this.coletor = coletor;
	}

	/**
	 * Métodos de CRUD - Criar, Visualizar, Editar, Deletar
	 */
	@Override
	public String criar(Coletor obj) {
		try {
			this.coletorService.salvar(obj);
		} catch (NegocioException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}


	@Override
	public String visualizar(Coletor obj) {
		try {
			this.coletor = this.coletorService.buscar(obj);
		} catch (NegocioException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}


	@Override
	public String editar(Coletor obj) {
		try {
			this.coletorService.atualizar(obj);
		} catch (NegocioException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}


	@Override
	public String deletar(Coletor obj) {
		try {
			this.coletorService.remover(obj);
		} catch (NegocioException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
}
