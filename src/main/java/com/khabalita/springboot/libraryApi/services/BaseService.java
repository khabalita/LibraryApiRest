package com.khabalita.springboot.libraryApi.services;

import com.khabalita.springboot.libraryApi.entities.Base;

import java.io.Serializable;
import java.util.List;

public interface BaseService<D extends Base, ID extends Serializable> {
    List<D> findAll();
    D findById(ID id);
    D save(D dto);
    D update(ID id, D dto);
    void delete(ID id);

}
