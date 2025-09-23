package com.example.HealthcareAppointment;

import com.example.HealthcareAppointment.model.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepository extends JpaRepository<Patient, Long> {}
