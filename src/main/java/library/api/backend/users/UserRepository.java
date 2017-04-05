package library.api.backend.users;

import org.springframework.data.repository.CrudRepository;


public interface UserRepository extends CrudRepository <User, Integer> {
}
