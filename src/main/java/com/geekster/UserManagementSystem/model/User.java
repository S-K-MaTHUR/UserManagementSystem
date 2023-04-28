package com.geekster.UserManagementSystem.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class User {

    private String userId;
    private String userName;
    private String Address;
    private String phoneNumber;
}
