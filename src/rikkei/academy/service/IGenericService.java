package rikkei.academy.service;

import rikkei.academy.model.Singer;

import java.util.List;

public interface IGenericService<E> {
    List<E> findAll();
    void save(E e);
    void deleteById(int id);
    E findById(int id);
    void edit(int id, E e);
    void sort();
}
