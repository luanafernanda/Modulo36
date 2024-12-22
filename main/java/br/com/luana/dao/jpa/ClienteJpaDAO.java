package br.com.luana.dao.jpa;

import br.com.luana.dao.generic.jpa.GenericJpaDB1DAO;
import br.com.luana.domain.jpa.ClienteJpa;


public class ClienteJpaDAO extends GenericJpaDB1DAO<ClienteJpa, Long> implements IClienteJpaDAO<ClienteJpa> {

	public ClienteJpaDAO() {
		super(ClienteJpa.class);
	}

}