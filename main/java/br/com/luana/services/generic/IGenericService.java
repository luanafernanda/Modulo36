package br.com.luana.services.generic;

import java.io.Serializable;
import java.util.Collection;

import br.com.luana.dao.Persistente;
import br.com.luana.exceptions.DAOException;
import br.com.luana.exceptions.TipoChaveNaoEncontradaException;

public interface IGenericService<T extends Persistente, E extends Serializable> {
    Boolean cadastrar(T entity) throws TipoChaveNaoEncontradaException, DAOException;
    void excluir(E valor) throws DAOException;
    void alterar(T entity) throws TipoChaveNaoEncontradaException, DAOException;
    T consultar(E valor) throws DAOException;
    Collection<T> buscarTodos() throws DAOException;
}
