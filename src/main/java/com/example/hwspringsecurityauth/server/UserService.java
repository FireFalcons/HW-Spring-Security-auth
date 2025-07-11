package com.example.hwspringsecurityauth.server;

import com.example.hwspringsecurityauth.dto.CreateRequestUserDto;
import com.example.hwspringsecurityauth.dto.UserDto;

import java.util.List;

public interface UserService {
    UserDto save(CreateRequestUserDto requestUserDto);
    List<UserDto> findAll();
}
