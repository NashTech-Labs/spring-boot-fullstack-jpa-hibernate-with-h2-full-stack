package com.knoldus.fullstack.springboot.jpa.hibernate.course;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseJpaRepository extends JpaRepository<Course, Long> {
    List<Course> findByUsername(String username);
}