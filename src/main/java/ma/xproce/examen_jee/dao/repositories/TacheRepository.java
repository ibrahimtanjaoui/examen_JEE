package ma.xproce.examen_jee.dao.repositories;

import ma.xproce.examen_jee.dao.entities.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TacheRepository extends JpaRepository<Task,Integer> {

}
