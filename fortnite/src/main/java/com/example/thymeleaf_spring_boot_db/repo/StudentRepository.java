package com.example.thymeleaf_spring_boot_db.repo;

import com.example.thymeleaf_spring_boot_db.entities.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student,Integer> {
}
