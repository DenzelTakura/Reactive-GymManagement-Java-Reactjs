package com.denzel.GymManagementSystem.model;


import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Table
public record Trainer(@Id Long id, String firstName, String lastName, String gender,
                      String idNumber, String specialty, String phoneNumber, String emailAddress){}