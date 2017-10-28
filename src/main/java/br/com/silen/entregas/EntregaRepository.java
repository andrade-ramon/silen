package br.com.silen.entregas;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.RepositoryDefinition;
import org.springframework.data.repository.query.Param;


@RepositoryDefinition(domainClass = Entrega.class, idClass = Long.class)
public interface EntregaRepository {

	List<Entrega> findAll();

	Optional<Entrega> findById(Long id);

	Entrega save(Entrega entrega);

	List<Entrega> findAllByMotoboyUserId(Long userId);
	
	@Query(value = "select e.* from entrega e where e.`motoboy_id` in (:motoboyIds) and e.status = 'ABERTA'", nativeQuery = true)
	List<Entrega> findAllByMotoboyIds(@Param("motoboyIds") List<Long> motoboyIds);
	
}
