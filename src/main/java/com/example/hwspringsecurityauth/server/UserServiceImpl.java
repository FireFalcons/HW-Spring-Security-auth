package com.example.hwspringsecurityauth.server;

import com.example.hwspringsecurityauth.dto.CreateRequestUserDto;
import com.example.hwspringsecurityauth.dto.UserDto;
import com.example.hwspringsecurityauth.mapper.UserMapper;
import com.example.hwspringsecurityauth.model.User;
import com.example.hwspringsecurityauth.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;
    private final UserMapper userMapper;

    @Override
    public UserDto save(CreateRequestUserDto requestUserDto) {
        if (!requestUserDto.getPassword().equals(requestUserDto.getRepeat_password())) {
            throw new IllegalArgumentException("Password do not match");
        }

        User user = userMapper.toModel(requestUserDto);
        return userMapper.toDto(userRepository.save(user));
    }

    @Override
    public List<UserDto> findAll() {
        return userRepository.findAll().stream()
                .map(userMapper::toDto)
                .toList();
    }
}
