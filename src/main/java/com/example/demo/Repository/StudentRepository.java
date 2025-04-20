package com.example.demo.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.demo.Domain.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, String> {
    // This interface will automatically provide CRUD operations for the Student entity
}
