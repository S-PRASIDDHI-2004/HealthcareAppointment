package com.example.HealthcareAppointment;

import com.example.HealthcareAppointment.model.Appointment;
import com.example.HealthcareAppointment.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("/api/appointments")
public class AppointmentController {

    @Autowired
    private Service appointmentService;

    @GetMapping
    public List<Appointment> getAllAppointments() {
        return appointmentService.getAllAppointments();
    }

    @GetMapping("/{id}")
    public Appointment getAppointment(@PathVariable Long id) {
        return appointmentService.getAppointmentById(id);
    }

    @PostMapping
    public Appointment bookAppointment(@RequestParam Long patientId,
                                       @RequestParam Long doctorId,
                                       @RequestParam String appointmentDate,
                                       @RequestParam String reason) {
        LocalDateTime dateTime = LocalDateTime.parse(appointmentDate);
        return appointmentService.bookAppointment(patientId, doctorId, dateTime, reason);
    }

    @PutMapping("/{id}")
    public Appointment updateAppointment(@PathVariable Long id,
                                         @RequestParam String appointmentDate,
                                         @RequestParam String reason) {
        LocalDateTime dateTime = LocalDateTime.parse(appointmentDate);
        return appointmentService.updateAppointment(id, dateTime, reason);
    }

    @DeleteMapping("/{id}")
    public void cancelAppointment(@PathVariable Long id) {
        appointmentService.cancelAppointment(id);
    }
}
