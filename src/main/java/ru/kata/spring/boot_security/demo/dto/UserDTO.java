package ru.kata.spring.boot_security.demo.dto;

import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Positive;
import java.util.Set;

@Data
public class UserDTO {
    private Long id;
    private String name;
    private String surname;
    @Positive
    private byte age;
    @NotBlank
    private String email;
    @NotBlank
    private String password;
    private Set<String> roles;

}
