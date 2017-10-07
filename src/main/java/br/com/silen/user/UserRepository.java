package br.com.silen.user;

import java.util.Optional;

import org.springframework.data.repository.RepositoryDefinition;

@RepositoryDefinition(domainClass = User.class, idClass = Long.class)
public interface UserRepository {
	
	Optional<User> findByUsernameAndPassword(String username, String password);
	
}
