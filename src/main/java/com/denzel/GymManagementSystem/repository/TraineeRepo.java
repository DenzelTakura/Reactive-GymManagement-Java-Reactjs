package com.denzel.GymManagementSystem.repository;


import com.denzel.GymManagementSystem.model.Trainee;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TraineeRepo extends ReactiveCrudRepository<Trainee,Long> {
Trainee findTraineeByIdNumber(String idNumber);
}
