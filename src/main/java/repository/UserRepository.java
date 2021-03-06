package repository;
/**
 * 
 * @author: Oneto, Fernando
 * @author: Diez, Lautaro
 *
 */

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import model.User;

@RepositoryRestResource(exported = false)
public interface UserRepository extends PagingAndSortingRepository<User, Long>{
	User findByUsername (String username);

	List<User> findBy();
}
