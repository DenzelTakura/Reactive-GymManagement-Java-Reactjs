package com.denzel.GymManagementSystem.serviceimpl;

import com.denzel.GymManagementSystem.model.Trainee;
import com.denzel.GymManagementSystem.repository.TraineeRepo;
import com.denzel.GymManagementSystem.service.TraineeService;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.List;

@Service
public class TraineeServiceImpl implements TraineeService {
    @Override
    public Mono<Trainee> save(Trainee trainee) {
        return null;
    }

    @Override
    public Flux<Trainee> findAll() {
        return null;
    }

    @Override
    public Mono<Trainee> getById(Long id) {
        return null;
    }

    @Override
    public Flux<Trainee> findByTrainerId(Long id) {
        return null;
    }

    @Override
    public Mono<Trainee> checkId(String idNumber) {
        return null;
    }
}
