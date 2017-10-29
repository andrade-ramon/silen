package br.com.silen.entregas;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.RepositoryDefinition;

@RepositoryDefinition(domainClass = Entrega.class, idClass = Long.class)
public interface EntregaRepository {

	List<Entrega> findAll();

	Optional<Entrega> findById(Long id);

	Entrega save(Entrega entrega);
	
}
