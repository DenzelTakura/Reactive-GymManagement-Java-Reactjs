package com.denzel.GymManagementSystem.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

import jakarta.persistence.OneToOne;

import java.util.Date;

@Table
public record MembershipDetails(@Id Long id, @OneToOne Trainee trainee, String workoutType, Date admissionDate, Date endSessionDate
){}
