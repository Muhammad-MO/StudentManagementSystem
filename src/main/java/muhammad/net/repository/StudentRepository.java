package muhammad.net.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import muhammad.net.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long>{

}
