package com.denzel.GymManagementSystem.service;

import com.denzel.GymManagementSystem.model.Contact;
import reactor.core.publisher.Mono;

public interface ContactService extends GenericService<Contact>{

    Mono<Contact> contactCheck(Contact contact, Contact[] contacts);
    boolean isEmailUnique(String email);
    boolean isPhoneNumberUnique(String phone);

}
