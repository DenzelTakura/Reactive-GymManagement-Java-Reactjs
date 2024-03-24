package com.denzel.GymManagementSystem.service;


import com.denzel.GymManagementSystem.model.Payments;
import reactor.core.publisher.Flux;

import java.util.List;

public interface PaymentsService extends GenericService<Payments>{
Flux<Payments> findByTraineeId(Long id);

}
