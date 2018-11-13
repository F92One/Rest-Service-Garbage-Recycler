package repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import model.UserRecycling;
import java.util.List;

/**
 * 
 * @author: Oneto, Fernando
 * @author: Diez, Lautaro
 *
 */

@RepositoryRestResource(exported = false)
public interface UserRecyclingRepository extends PagingAndSortingRepository<UserRecycling, Long>{
	
	List<UserRecycling> findBy(); // this is automatic
}
