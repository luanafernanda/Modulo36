
package br.com.luana.dao.jpa;

import br.com.luana.dao.generic.jpa.GenericJpaDB2DAO;
import br.com.luana.domain.jpa.ClienteJpa;


public class ClienteJpaDB2DAO extends GenericJpaDB2DAO<ClienteJpa, Long> implements IClienteJpaDAO<ClienteJpa> {

	public ClienteJpaDB2DAO() {
		super(ClienteJpa.class);
	}

}