package br.ufrn.apoo.garbagego.services;

import br.ufrn.apoo.garbagego.dao.CRUDDAO;
import br.ufrn.apoo.garbagego.dao.ColetorDAO;
import br.ufrn.apoo.garbagego.domain.Coletor;
import br.ufrn.apoo.garbagego.exceptions.NegocioException;

public class ColetorService implements CRUDService<Coletor> {

	private CRUDDAO<Coletor> coletorDAO;
	
	public ColetorService() {
		this.coletorDAO = new ColetorDAO();
	}

	@Override
	public void salvar(Coletor obj) throws NegocioException {
		// TODO Auto-generated method stub
		this.validar(obj);
		
		this.coletorDAO.salvar(obj);
	}

	@Override
	public Coletor buscar(Coletor obj) throws NegocioException {
		// TODO Auto-generated method stub
		this.validar(obj);
		
		return this.coletorDAO.buscar(obj);
	}

	@Override
	public void atualizar(Coletor obj) throws NegocioException {
		// TODO Auto-generated method stub
		this.validar(obj);
		
		this.atualizar(obj);
	}

	@Override
	public void remover(Coletor obj) throws NegocioException {
		// TODO Auto-generated method stub
		this.validar(obj);
		
		this.atualizar(obj);
	}

	@Override
	public void validar(Coletor obj) throws NegocioException {
		// TODO Auto-generated method stub
		
	}

}
