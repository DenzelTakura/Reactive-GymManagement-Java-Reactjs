package com.denzel.GymManagementSystem.repository;


import com.denzel.GymManagementSystem.model.Contact;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContactRepo extends ReactiveCrudRepository<Contact,Long> {

    boolean existsByEmailAddress(String email);
    boolean existsByPhoneNumber(String phone);

}
