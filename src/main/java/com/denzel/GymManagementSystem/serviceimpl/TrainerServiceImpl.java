package com.denzel.GymManagementSystem.serviceimpl;

import com.denzel.GymManagementSystem.model.Trainer;
import com.denzel.GymManagementSystem.repository.TrainerRepo;
import com.denzel.GymManagementSystem.service.TrainerService;
import lombok.Data;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
@Data
public class TrainerServiceImpl implements TrainerService {
    private final TrainerRepo trainerRepo;

    @Override
    public Mono<Trainer> save(Trainer trainer) {
        return trainerRepo.save(trainer);
    }



    @Override
    public Flux<Trainer> findAll() {
        return trainerRepo .findAll() ;
    }

    @Override
    public Mono<Trainer> getById(Long id) {
        return trainerRepo.findById(id);
    }


    @Override
    public Mono<Trainer> deleteTrainerById(Long id) {

        return trainerRepo.deleteTrainerById(id);
    }

    @Override
    public Mono<Trainer> updateTrainerBy(Long id, Trainer trainer) {
        System.out.println("updated .."+trainer);
        return trainerRepo.save(trainer);
    };

}
