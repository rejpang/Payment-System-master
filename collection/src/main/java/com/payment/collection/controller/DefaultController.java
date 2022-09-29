package com.payment.collection.controller;

import org.springframework.http.ResponseEntity;

public interface DefaultController<T, V> {

    ResponseEntity getAll();

    ResponseEntity add(T t);

    ResponseEntity update(T t);

    ResponseEntity delete(V v);
}
