package br.ufrn.apoo.garbagego.dao;

public interface CRUDDAO<T> {
	void salvar(T obj);
	T buscar(T obj);
	void atualizar(T obj);
	void remover(T obj);
}
