package br.com.luana.services.generic;

import java.io.Serializable;
import java.util.Collection;

import br.com.luana.dao.Persistente;
import br.com.luana.dao.generic.IGenericDAO;
import br.com.luana.exceptions.DAOException;
import br.com.luana.exceptions.MaisDeUmRegistroException;
import br.com.luana.exceptions.TableException;
import br.com.luana.exceptions.TipoChaveNaoEncontradaException;

public abstract class GenericService<T extends Persistente, E extends Serializable> {

    protected IGenericDAO<T, E> dao;

    public GenericService(IGenericDAO<T, E> dao) {
        this.dao = dao;
    }

    public Boolean cadastrar(T entity) throws TipoChaveNaoEncontradaException, DAOException {
        return this.dao.cadastrar(entity);
    }

    public void excluir(E valor) throws DAOException {
        this.dao.excluir(valor);
    }

    public void alterar(T entity) throws TipoChaveNaoEncontradaException, DAOException {
        this.dao.alterar(entity);
    }

    public T consultar(E valor) throws DAOException {
        try {
            return this.dao.consultar(valor);
        } catch (MaisDeUmRegistroException | TableException e) {
            e.printStackTrace();
        }
        return null;
    }

    public Collection<T> buscarTodos() throws DAOException {
        return this.dao.buscarTodos();
    }
}
