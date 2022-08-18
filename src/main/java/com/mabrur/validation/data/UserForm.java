package com.mabrur.validation.data;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import lombok.Data;

@Data
public class UserForm {

    private Long id;

    @NotEmpty(message = "Username is mandatory")
    @Size(min = 8, max = 15)
    private String username;

    @NotEmpty(message = "Password is mandatory")
    @Size(min = 8)
    private String password;

}
