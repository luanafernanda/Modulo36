
package br.com.luana.dao.jpa;

import br.com.luana.dao.generic.jpa.IGenericJpaDAO;
import br.com.luana.domain.jpa.VendaJpa;
import br.com.luana.exceptions.DAOException;
import br.com.luana.exceptions.TipoChaveNaoEncontradaException;


public interface IVendaJpaDAO extends IGenericJpaDAO<VendaJpa, Long>{

	public void finalizarVenda(VendaJpa venda) throws TipoChaveNaoEncontradaException, DAOException;
	
	public void cancelarVenda(VendaJpa venda) throws TipoChaveNaoEncontradaException, DAOException;
	
	public VendaJpa consultarComCollection(Long id);
}