
package br.com.luana.dao.jpa;

import br.com.luana.dao.generic.jpa.GenericJpaDAO;
import br.com.luana.domain.jpa.ClienteJpa;


public class ClienteJpaDAO extends GenericJpaDAO<ClienteJpa, Long> implements IClienteJpaDAO {

	public ClienteJpaDAO() {
		super(ClienteJpa.class);
	}

}