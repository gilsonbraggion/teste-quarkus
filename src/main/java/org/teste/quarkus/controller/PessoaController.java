package org.teste.quarkus.controller;

import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.teste.quarkus.model.Pessoa;
import org.teste.quarkus.service.PessoaService;

@Path("/pessoas")
@Produces(MediaType.APPLICATION_JSON)
public class PessoaController {
	
	@Inject
	PessoaService pessoaService;

    @GET
    @Consumes(MediaType.TEXT_PLAIN)
    public List<Pessoa> listagem(String nome) {
    	return pessoaService.listagemPessoa(nome);
    }
    
    @GET
    @Path(value = "/{nome}")
    @Consumes(MediaType.TEXT_PLAIN)
    public List<Pessoa> buscarPorNome(@PathParam("nome") String nome) {
    	return pessoaService.listagemPessoa(nome);
    }
    
    
    @POST
    @Path(value = "/salvar")
    @Consumes(MediaType.APPLICATION_JSON)
    public Pessoa salvarPessoa(Pessoa pessoa) {
    	return pessoaService.salvarPessoa(pessoa);
    }
}