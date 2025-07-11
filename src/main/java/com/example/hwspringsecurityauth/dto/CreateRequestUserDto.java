package com.example.hwspringsecurityauth.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class CreateRequestUserDto {
    @NotNull
    private String login;

    @NotNull
    @Size(min = 5)
    private String password;

    @NotNull
    @JsonProperty("repeat_password")
    private String repeat_password;
}
