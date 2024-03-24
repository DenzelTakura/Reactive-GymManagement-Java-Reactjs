package com.denzel.GymManagementSystem.repository;


import com.denzel.GymManagementSystem.model.MembershipDetails;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MembershipdetailsRepo extends ReactiveCrudRepository<MembershipDetails,Long> {
}
