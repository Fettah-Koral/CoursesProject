package com.restapi.project.courses.services;

import java.util.List;

import com.restapi.project.courses.entities.Course;

public interface CourseService {
	
	public List<Course> getCourses();

	public Course getCourse(Long id);

	public Course addCourse(Course course);

	public Course updateCourse(Course course);

	public void deleteCourse(Long id);
}
