package com.denzel.GymManagementSystem.model;

import jakarta.persistence.OneToOne;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

import java.util.Date;

@Table
public record Payments(@Id Long id, @OneToOne Trainee trainee, String feesMode, Float feesAmount, Date paymentdate, String receiptDetail
){}
