package com.runners.cinema.dto.request;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.runners.cinema.dto.response.ValidMessages;
import com.runners.cinema.exception.ErrorMessage;

import javax.persistence.Column;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.time.LocalDate;

public class RegisterRequest {

    @Size(max = 50)
    @NotBlank(message = ValidMessages.NAME_ENTER)
    private String name;

    @Size(max = 50)
    @NotBlank(message = ValidMessages.SURNAME_ENTER)
    private String surname;

    @Email(message = ValidMessages.EMAIL_ENTER)
    private String email;

    @NotBlank(message = ValidMessages.PASSWORD_ENTER)
    @Pattern(regexp = "((?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%]).{4,15})",
            message =ValidMessages.PASSWORD_REGEX )
    private String password;

    @Pattern(regexp = "^((\\(\\d{3}\\))|\\d{3})[- .]?\\d{3}[- .]?\\d{4}$", //(541) 317-8828
            message = ValidMessages.PHONE_NUMBER_REGEX)
    @Size(min=14, max=14)
    @NotBlank(message = ValidMessages.PHONE_NUMBER_ENTER)
    private String phoneNumber;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    private LocalDate dateOfBirth;

    public RegisterRequest() {
    }

    public RegisterRequest(String name, String surname, String email, String password, String phoneNumber, LocalDate dateOfBirth) {
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.password = password;
        this.phoneNumber = phoneNumber;
        this.dateOfBirth = dateOfBirth;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
}
