package com.learn.app.service;

import com.learn.app.model.dto.UserDto;
import reactor.core.publisher.Mono;

public interface UserService {

    Mono<String> createUser(UserDto userDto);
    Mono<UserDto> getUser(String userId);
}
