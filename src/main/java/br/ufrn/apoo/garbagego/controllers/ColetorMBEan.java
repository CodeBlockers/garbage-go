package br.ufrn.apoo.garbagego.controllers;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import br.ufrn.apoo.garbagego.domain.Coletor;
import br.ufrn.apoo.garbagego.domain.Localizacao;
import br.ufrn.apoo.garbagego.exceptions.NegocioException;
import br.ufrn.apoo.garbagego.services.CRUDService;
import br.ufrn.apoo.garbagego.services.ColetorService;

@ManagedBean(name="coletorMBean")
@SessionScoped
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
		return this.irParaLista();
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
		return this.irParaLista();
	}


	@Override
	public String deletar(Coletor obj) {
		try {
			this.coletorService.remover(obj);
		} catch (NegocioException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.irParaLista();
	}
	
	/**
	 * Métodos de navegação
	 */
	private String getDir() {
		return "./pages/coletor/";
	}
	
	public String irParaCriar() {
		this.inicializar();
		
		return this.getDir() + "criar.jsf";
	}
	
	public String irParaEditar(Coletor obj) {
		this.coletor = obj;
		
		return this.getDir() + "editar.jsf";
	}
	
	public String irParaVisualizar(Coletor obj) {
		this.coletor = obj;
		
		return this.getDir() + "visualizar.jsf";
	}
	
	public String irParaLista() {
		return this.getDir() + "lista.jsf";
	}
	
	
	
	/**
	 * GETs e SETs
	 */
	public Coletor getColetor() {
		return coletor;
	}

	public void setColetor(Coletor coletor) {
		this.coletor = coletor;
	}
}
