package com.learn.app.service;

import com.learn.app.model.dto.UserDto;
import com.learn.app.repository.UserRepository;
import com.learn.app.util.ModelMapper;
import lombok.NonNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    /**
     * Help to create new user in db
     * @param userDto New User details to save
     * */
    @Override
    public Mono<String> createUser(UserDto userDto) {

        return userRepository.save(ModelMapper.toUserEntity(userDto)).map(e -> e.getId() != null ? "Successfully saved user !!!" : "Fail to save :(");
    }

    /**
     * Fetch user details
     * */
    @Override
    public Mono<UserDto> getUser(@NonNull String userId) {

        return userRepository.findById(userId)
                .flatMap(e -> Mono.just(ModelMapper.toUserDto(e)))
                .onErrorResume(e -> Mono.just(UserDto.builder().build()));
    }
}
