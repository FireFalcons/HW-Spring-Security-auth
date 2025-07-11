package com.example.hwspringsecurityauth.controller;

import com.example.hwspringsecurityauth.dto.CreateRequestUserDto;
import com.example.hwspringsecurityauth.dto.UserDto;
import com.example.hwspringsecurityauth.server.UserService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/usersAccount")
public class UserController {
    private final UserService userService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public UserDto create(@RequestBody @Valid CreateRequestUserDto requestUserDto) {
        return userService.save(requestUserDto);
    }

    @GetMapping
    private List<UserDto> findAll() {
        return userService.findAll();
    }
}
