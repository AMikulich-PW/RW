package lr5.repository;

import lr5.domain.Professor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Prof extends JpaRepository<Professor, Long> {
}