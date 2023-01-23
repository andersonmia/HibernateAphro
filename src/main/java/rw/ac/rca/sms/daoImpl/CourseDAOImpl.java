package rw.ac.rca.sms.daoImpl;

import rw.ac.rca.sms.dao.CourseDAO;
import rw.ac.rca.sms.orm.Course;
import java.util.List;

public class CourseDAOImpl extends DAO implements CourseDAO {
    private static CourseDAOImpl instance;

    private CourseDAOImpl(){}

    public static CourseDAOImpl getInstance(){
        if(instance == null){
            return new CourseDAOImpl();
        }else {
            return instance;
        }
    }

    @Override
    public Course saveCourse(Course course) {
        return null;
    }

    @Override
    public Course updateCourse(Course course) {
        return null;
    }

    @Override
    public Course saveOrUpdateCourse(Course course) {
        try{
            begin();
            getSession().saveOrUpdate(course);
            commit();
            return course;
        }catch (Exception e){
            rollback();
            return null;
        }
    }

    @Override
    public Course deleteCourse(Course course) {
        return null;
    }

    @Override
    public Course getCourseById(Course course) {
        return null;
    }

    @Override
    public List<Course> getAllCourses() {
        return null;
    }
}