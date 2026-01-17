package com.khabalita.springboot.libraryApi.controller;

import com.khabalita.springboot.libraryApi.dto.BaseDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.io.Serializable;

public interface BaseController <D extends BaseDto, ID extends Serializable> {
    ResponseEntity<?> getAll();
    ResponseEntity<?> getOne(@PathVariable ID id);
    ResponseEntity<?> save(@RequestBody D dto);
    ResponseEntity<?> update(@PathVariable ID id, @RequestBody D dto);
    ResponseEntity<?> delete(@PathVariable ID id);
}
