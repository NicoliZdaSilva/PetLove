package br.com.petlove.dao;

import br.com.petlove.model.Pet;
import java.util.List;

public interface IDAO<T> {
    void save (T t);
    void update  (T t);
    void delete (Long id);
    List<T> findAll();
    T findById(Long id);
}
