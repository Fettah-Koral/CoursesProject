package com.restapi.project.courses.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.restapi.project.courses.entities.Course;

@Repository
public interface CourseRepository extends JpaRepository<Course, Long>{

}
