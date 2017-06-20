package br.ufrn.apoo.garbagego.controllers;

public interface CRUDController<T> {
	String criar(T obj);
	String visualizar(T obj);
	String editar(T obj);
	String deletar(T obj);
}
