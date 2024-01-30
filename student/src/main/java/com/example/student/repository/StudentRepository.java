package com.example.student.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.student.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {
@Query(value = "SELECT student_id FROM student WHERE branch = :branch ORDER BY RAND() LIMIT :numStudent", nativeQuery = true)
List<Integer> findRandomIdsBybranch(Integer numStudent, String branch);
}

