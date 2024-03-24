package com.denzel.GymManagementSystem.service;


import com.denzel.GymManagementSystem.model.Trainer;
import reactor.core.publisher.Mono;

public interface TrainerService extends GenericService<Trainer> {

    Mono<Trainer> deleteTrainerById(Long id);
    Mono<Trainer> updateTrainerBy( Long id,Trainer trainer);

}
