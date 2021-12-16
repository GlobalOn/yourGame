package yourGame.project10.repositories;

import org.springframework.data.repository.CrudRepository;
import yourGame.project10.model.UserRoles;

public interface UserRoleRepository extends CrudRepository<UserRoles, Integer> {
}
