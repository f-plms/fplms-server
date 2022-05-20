package plms.ManagementService.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import plms.ManagementService.repository.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student,Integer> {

}
