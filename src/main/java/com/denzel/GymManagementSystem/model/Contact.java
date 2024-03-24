package com.denzel.GymManagementSystem.model;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.ManyToOne;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Table
public record Contact (@Id Long id, @ManyToOne Trainee trainee, String emailAddress, String phoneNumber, String homeAddress) {
}
