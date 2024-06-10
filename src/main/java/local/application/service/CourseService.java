package local.application.service;

import local.application.model.Course;
import local.application.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class CourseService implements CrudService<Course> {

    @Autowired
    private CourseRepository courseRepository;

    public CourseService() {
    }

    @Override
    public List<Course> list() {
        return courseRepository.findAll();
    }

    @Override
    public Course create(Course course) {
        return null;
    }

    @Override
    public Optional<Course> get(int Id) {
        return Optional.empty();
    }

    @Override
    public void update(Course course, int id) {

    }

    @Override
    public void delete(int id) {

    }
}