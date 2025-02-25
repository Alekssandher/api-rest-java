package alekssandher.api_rest_java.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import alekssandher.api_rest_java.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long >{
    
}
