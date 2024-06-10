package local.application.repository;

import local.application.model.Course;

import java.util.ArrayList;
import java.util.List;

public class CourseRepository implements CrudRepository<Course> {

    private List<Course> courseList;

    @Override
    public List<Course> findAll() {
        courseList = new ArrayList<>();
        Course springboot = new Course
                (1,
                        "Getting started with spring boot 2",
                        "Lombok is a Java library that provides annotations to simplify Java development by automating the generation of boilerplate code.",
                        "https://mvnrepository.com/artifact/org.projectlombok/lombok/1.18.30");
        courseList.add(springboot);
        return courseList;
    }
}
