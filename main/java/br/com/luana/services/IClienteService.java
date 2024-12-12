package br.com.luana.services;

import br.com.luana.domain.Cliente;
import br.com.luana.exceptions.DAOException;
import br.com.luana.exceptions.TipoChaveNaoEncontradaException;
import br.com.luana.services.generic.IGenericService;

public interface IClienteService extends IGenericService<Cliente, Long> {
    Cliente buscarPorCPF(Long cpf) throws DAOException;
}
