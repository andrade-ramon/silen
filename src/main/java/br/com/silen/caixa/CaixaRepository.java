package br.com.silen.caixa;

import java.util.List;

import org.springframework.data.repository.RepositoryDefinition;

@RepositoryDefinition(domainClass = Caixa.class, idClass = Long.class)
public interface CaixaRepository {

	List<Caixa> findAll();
	
}
