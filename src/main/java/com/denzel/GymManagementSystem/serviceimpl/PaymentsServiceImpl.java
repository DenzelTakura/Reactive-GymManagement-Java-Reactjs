package com.denzel.GymManagementSystem.serviceimpl;

import com.denzel.GymManagementSystem.model.Payments;
import com.denzel.GymManagementSystem.repository.PaymentsRepo;
import com.denzel.GymManagementSystem.repository.TraineeRepo;
import com.denzel.GymManagementSystem.service.PaymentsService;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.List;

@Service
public class PaymentsServiceImpl implements PaymentsService {
    @Override
    public Mono<Payments> save(Payments payments) {
        return null;
    }

    @Override
    public Flux<Payments> findAll() {
        return null;
    }

    @Override
    public Mono<Payments> getById(Long id) {
        return null;
    }

    @Override
    public Flux<Payments> findByTraineeId(Long id) {
        return null;
    }
}

