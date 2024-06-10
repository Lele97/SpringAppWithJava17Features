package local.application.service;

import local.application.model.Course;

import java.util.Optional;
import java.util.List;

public interface CrudService<T> {

    List<T> list();

    T create(T t);

    Optional<T> get(int Id);

    void update(Course course, int id);

    void delete(int id);

}
