package com.example.demomvcedoclass.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class SignUp {
    private String firstName;
    private String lastName;
    private String userName;
    private String email;
    private String password;
    private String Location;
}
