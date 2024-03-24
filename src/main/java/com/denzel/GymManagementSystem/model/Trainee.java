package com.denzel.GymManagementSystem.model;


import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.ManyToOne;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

import java.util.Date;

@Table
public record Trainee(@Id Long id, @ManyToOne Trainee trainee, @Enumerated(EnumType.STRING) Gender gender, String firstName, String lastName, String idNumber, Date birthDate, Float height, Float weight){}
