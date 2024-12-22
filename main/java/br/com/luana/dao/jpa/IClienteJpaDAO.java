
package br.com.luana.dao.jpa;

import br.com.luana.dao.generic.jpa.IGenericJpaDAO;
import br.com.luana.domain.jpa.Persistente;


public interface IClienteJpaDAO<T extends Persistente> extends IGenericJpaDAO<T, Long>{

}