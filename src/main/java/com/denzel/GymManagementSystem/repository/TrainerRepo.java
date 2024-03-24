package com.denzel.GymManagementSystem.repository;

import com.denzel.GymManagementSystem.model.Trainer;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Mono;

@Repository
public interface TrainerRepo extends ReactiveCrudRepository<Trainer,Long> {
Mono<Trainer>deleteTrainerById(Long id);
}
