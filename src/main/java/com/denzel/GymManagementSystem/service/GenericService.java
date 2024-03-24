package com.denzel.GymManagementSystem.service;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.List;

public interface GenericService <T> {
    Mono<T> save(T t);
    Flux<T> findAll();
    Mono<T> getById(Long id);


}
