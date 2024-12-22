package br.com.luana.dao.jpa;

import br.com.luana.dao.generic.jpa.GenericJpaDB1DAO;
import br.com.luana.domain.jpa.ProdutoJpa;


public class ProdutoJpaDAO extends GenericJpaDB1DAO<ProdutoJpa, Long> implements IProdutoJpaDAO {

	public ProdutoJpaDAO() {
		super(ProdutoJpa.class);
	}

}