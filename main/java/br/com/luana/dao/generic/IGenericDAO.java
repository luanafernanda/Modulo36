package br.com.luana.dao.generic;

import br.com.luana.dao.Persistente;
import br.com.luana.exceptions.DAOException;
import br.com.luana.exceptions.MaisDeUmRegistroException;
import br.com.luana.exceptions.TableException;
import br.com.luana.exceptions.TipoChaveNaoEncontradaException;

import java.io.Serializable;
import java.util.Collection;


public interface IGenericDAO <T extends Persistente, E extends Serializable> {

    
    public Boolean cadastrar(T entity) throws TipoChaveNaoEncontradaException, DAOException;

    
    public void excluir(E valor) throws DAOException;

    
    public void alterar(T entity) throws TipoChaveNaoEncontradaException, DAOException;

    
    public T consultar(E valor) throws MaisDeUmRegistroException, TableException, DAOException;

  
    public Collection<T> buscarTodos() throws DAOException;
}