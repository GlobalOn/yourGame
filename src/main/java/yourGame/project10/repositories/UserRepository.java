package yourGame.project10.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import yourGame.project10.model.User;

@Repository
public interface UserRepository extends CrudRepository<User, Integer> {


}
