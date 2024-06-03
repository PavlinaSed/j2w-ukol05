package cz.czechitas.java2webapps.ukol5.controller;

import jakarta.validation.constraints.*;
//import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;

public class RegistrationForm {
    @NotBlank (message = "Name is mandatory.")
    private String firstName;
    @NotBlank (message = "Name is mandatory.")
    private String lastName;
    @NotNull (message = "Birthdate is mandatory.")
    @PastOrPresent (message = "Birthdate in future time is not valid.")
    //@DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    private LocalDate birthDate;
    @NotEmpty (message = "Please choose the gender.")
    private String gender;
    @NotNull (message = "Please choose the tour option.")
    private String tour;
    @Email
    private String email;

    private String phoneNumber;

    public RegistrationForm() {
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getTour() {
        return tour;
    }

    public void setTour(String tour) {
        this.tour = tour;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}