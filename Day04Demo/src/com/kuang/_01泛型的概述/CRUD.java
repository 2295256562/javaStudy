package com.kuang._01泛型的概述;

public interface CRUD<E> {
    E add(E entity);
    E delete(E entity);
    E update(E entity);
    E query(int id);
}
