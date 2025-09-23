package com.example.HealthcareAppointment;

import com.example.HealthcareAppointment.model.*;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppointmentRepository extends JpaRepository<Appointment, Long> {}
