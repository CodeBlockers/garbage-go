package br.ufrn.apoo.garbagego.services;

import br.ufrn.apoo.garbagego.exceptions.NegocioException;

public interface CRUDService<T> extends ServiceInterface<T>{
	void salvar(T obj) throws NegocioException;
	T buscar(T obj) throws NegocioException;
	void atualizar(T obj) throws NegocioException;
	void remover(T obj) throws NegocioException;
}
