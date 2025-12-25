package ma.xproce.examen_jee.dao.repositories;

import ma.xproce.examen_jee.dao.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Integer> {
    User findByUsername(String username);
}
