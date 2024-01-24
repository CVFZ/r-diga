package com.example.thymeleaf_spring_boot_db.repo;

import com.example.thymeleaf_spring_boot_db.entities.Schoolclass;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SchoolclassRepository extends JpaRepository<Schoolclass,Integer> {
}
