package com.example.welderbase.service;

import java.util.Set;

public interface CrudCervice<T, ID> {

    Set<T> findAll();

    T findById(ID id);

    T save(T object);

    void delete(T object);

    void deleteById(ID id);

}


