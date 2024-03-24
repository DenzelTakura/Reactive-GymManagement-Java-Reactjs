package com.denzel.GymManagementSystem.service;


import com.denzel.GymManagementSystem.model.Trainee;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.List;

public interface TraineeService extends GenericService<Trainee> {
Flux<Trainee> findByTrainerId(Long id);
Mono<Trainee> checkId(String idNumber);
}
