****HealthcareAppointment**
**
HealthcareAppointment is a Spring Boot + MySQL backend application for managing hospital appointments.
It allows you to add patients, doctors, and book appointments via REST APIs.
Swagger UI is included for easy API testing and documentation.

****Features****

**Patient Management**

Add new patients via API

View all registered patients

Each patient has a unique ID, name, and email

**Doctor Management**

Add new doctors via API

View all registered doctors

Each doctor has a unique ID, name, and specialty

**Appointment Scheduling**

Book appointments for patients with doctors

Specify appointment date and reason

View all scheduled appointments (future enhancement)

**REST API Support**

Fully RESTful endpoints for CRUD operations

JSON input/output format

**Swagger Integration**

Interactive API documentation and testing via Swagger UI

**Database Persistence**

Uses MySQL for storing patients, doctors, and appointments

**Scalable & Extensible**

Can be extended to include appointment cancellation, reminders, or notifications

****Technologies Used****

Java 17

Spring Boot 3.5.6

Spring Data JPA

MySQL

Swagger/OpenAPI (springdoc-openapi)

Postman (for testing APIs)
