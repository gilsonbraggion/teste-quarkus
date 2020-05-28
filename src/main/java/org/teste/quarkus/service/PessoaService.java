package org.teste.quarkus.service;

import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.transaction.Transactional;

import org.teste.quarkus.model.Pessoa;
import org.teste.quarkus.repository.PessoaRepository;

@ApplicationScoped
public class PessoaService {
	
	@Inject
	PessoaRepository repository;
	
	public List<Pessoa> listagemPessoa(String nome) {
		
		List<Pessoa> pessoas = repository.findAll().list();
		
		return pessoas;
	}
	
	@Transactional
	public Pessoa salvarPessoa(Pessoa pessoa) {
		
		repository.persist(pessoa);
		
		return pessoa;
	}
	
}
