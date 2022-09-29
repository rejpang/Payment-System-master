package com.payment.collection.service;

import java.util.List;

public interface CrudService<T, V> {

    List<T> getAll();

    void save(T t);

    void delete(V v);

}
