package com.restapi.project.courses.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.restapi.project.courses.entities.Course;
import com.restapi.project.courses.repositories.CourseRepository;

@Service
public class CourseServiceImpl implements CourseService{


	@Autowired
	private CourseRepository courseRepository;
	

	@Override
	public List<Course> getCourses() {
		return courseRepository.findAll();
	}

	@Override
	public Course getCourse(Long id) {
		return courseRepository.findById(id).orElseThrow(null);
	}

	@Override
	public Course addCourse(Course course) {
		courseRepository.save(course);
		return course;
	}

	@Override
	public Course updateCourse(Course course) {
		courseRepository.save(course);
		return course;
	}

	@Override
	public void deleteCourse(Long id) {
		courseRepository.deleteById(id);
	}

}
