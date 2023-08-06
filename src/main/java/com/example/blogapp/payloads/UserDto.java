package com.example.blogapp.payloads;

import jakarta.persistence.Column;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class UserDto {
    private Integer id;

    @NotEmpty
    @Size(min = 4, message = "Username Must have 4 characters")
    private String name;

    @Email(message = "Invalid Email Address")
    private String email;

    @NotEmpty
    @Size(min = 4, max = 8, message = "Password must be greater than 4 and lesser than 8 characters")
    private String password;

    @NotEmpty
    private String about;
}
