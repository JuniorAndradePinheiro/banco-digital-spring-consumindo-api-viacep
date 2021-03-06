package br.com.bancodigital.service;

import java.util.List;

import org.springframework.stereotype.Component;

import br.com.bancodigital.model.Cliente;

@Component
public interface ClienteService {
	
	List<Cliente> buscarTodos();
	Cliente buscarPorId(Long id);
	Cliente salvar(Cliente cliente);
	void atualizar(Long id, Cliente cliente);
	void deletar(Long id);
}
