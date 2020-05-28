package org.teste.quarkus.repository;

import java.util.List;

import javax.enterprise.context.ApplicationScoped;

import org.teste.quarkus.model.Pessoa;

import io.quarkus.hibernate.orm.panache.PanacheRepository;

@ApplicationScoped
public class PessoaRepository implements PanacheRepository<Pessoa> {
	
	List<Pessoa> buscarPorNome(String nome) {
		return list("nome", nome);
	}
	
}
