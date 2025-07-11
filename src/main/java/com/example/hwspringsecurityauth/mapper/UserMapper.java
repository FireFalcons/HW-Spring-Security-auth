package com.example.hwspringsecurityauth.mapper;

import com.example.hwspringsecurityauth.dto.CreateRequestUserDto;
import com.example.hwspringsecurityauth.dto.UserDto;
import com.example.hwspringsecurityauth.model.User;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserMapper {
    UserDto toDto(User user);
    User toModel(CreateRequestUserDto requestUserDto);
}
