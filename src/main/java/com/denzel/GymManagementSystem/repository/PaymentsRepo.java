package com.denzel.GymManagementSystem.repository;

import com.denzel.GymManagementSystem.model.Payments;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PaymentsRepo extends ReactiveCrudRepository<Payments,Long> {
    List<Payments> findPaymentsByTraineeId(Long id);

}
