package com.example.demo.Repository;

import org.springframework.data.repository.CrudRepository;
import com.example.demo.Entity.Course;

public interface CourseRepository extends CrudRepository<Course, Integer> {
    
}
