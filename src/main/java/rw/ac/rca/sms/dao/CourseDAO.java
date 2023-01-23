package rw.ac.rca.sms.dao;

import rw.ac.rca.sms.orm.Course;

import java.util.List;

public interface CourseDAO {
    public Course saveCourse(Course course);
    public Course updateCourse(Course course);
    public Course saveOrUpdateCourse(Course course);
    public Course deleteCourse(Course course);
    public Course getCourseById(Course course);
    public List<Course> getAllCourses();
}

