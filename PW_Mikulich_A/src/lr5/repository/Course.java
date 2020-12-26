package lr5.repository;

import lr5.domain.Name_course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface Course extends JpaRepository<Name_course, Long> {
}