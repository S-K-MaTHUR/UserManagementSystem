package com.geekster.UserManagementSystem.model;

import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

@Data
@AllArgsConstructor
public class User {

    @NotBlank
    @NotEmpty
    private String userId;

    @NotNull
    private String name;

    @Email
    @NotEmpty
    private String userName;
    private String Address;


    @Size(min=10,max = 12)
    private String phoneNumber;

    @DateTimeFormat
    private LocalDate date;

    @DateTimeFormat
    private LocalTime time;
}
