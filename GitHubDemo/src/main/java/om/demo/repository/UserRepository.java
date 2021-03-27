package om.demo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import om.demo.entity.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long>{

}
