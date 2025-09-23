package com.example.HealthcareAppointment;

import com.example.HealthcareAppointment.model.Patient;
import com.example.HealthcareAppointment.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/patients")
public class PatientController {

    @Autowired
    private PatientRepository patientRepository;

    // Get all patients
    @GetMapping
    public List<Patient> getAllPatients() {
        return patientRepository.findAll();
    }

    // Add new patient
    @PostMapping(consumes = "application/json")
    public Patient addPatient(@RequestBody Patient patient) {
        return patientRepository.save(patient);
    }
}
