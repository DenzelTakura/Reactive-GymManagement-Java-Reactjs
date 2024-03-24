package com.denzel.GymManagementSystem.serviceimpl;

import com.denzel.GymManagementSystem.model.Contact;
import com.denzel.GymManagementSystem.repository.ContactRepo;
import com.denzel.GymManagementSystem.service.ContactService;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.List;

@Service
public class ContactServiceImpl implements ContactService {
    @Override
    public Mono<Contact> contactCheck(Contact contact, Contact[] contacts) {
        return null;
    }

    @Override
    public boolean isEmailUnique(String email) {
        return false;
    }

    @Override
    public boolean isPhoneNumberUnique(String phone) {
        return false;
    }

    @Override
    public Mono<Contact> save(Contact contact) {
        return null;
    }

    @Override
    public Flux<Contact> findAll() {
        return null;
    }

    @Override
    public Mono<Contact> getById(Long id) {
        return null;
    }
}
