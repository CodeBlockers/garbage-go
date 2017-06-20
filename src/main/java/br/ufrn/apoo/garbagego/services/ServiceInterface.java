package br.ufrn.apoo.garbagego.services;

import br.ufrn.apoo.garbagego.exceptions.NegocioException;

public interface ServiceInterface<T> {
	void validar(T obj) throws NegocioException;
}
