package local.application.repository;

import java.util.List;

public interface CrudRepository<T> {

    public List<T> findAll();
}
