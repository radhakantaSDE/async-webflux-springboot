package com.learn.app.controller;

import com.learn.app.model.dto.UserDto;
import com.learn.app.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("user-service/v1/")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("user")
    public Mono<ResponseEntity<String>> createUser(@RequestBody UserDto user) {

        return userService.createUser(user)
                .flatMap(e -> Mono.just(ResponseEntity.ok("Success")))
                .onErrorResume(e -> Mono.just(ResponseEntity.ok("Error")));
    }

    @PutMapping("user")
    public Mono<ResponseEntity<String>> updateUser(@RequestBody UserDto user) {

        return Mono.just(ResponseEntity.ok("Success"));
    }

    @GetMapping("user/{user-id}")
    public Mono<ResponseEntity<UserDto>> getUser(@PathVariable("user-id") String userId) {

        return userService.getUser(userId)
                .flatMap(e -> {
                    System.out.println(e);
                    return Mono.just(ResponseEntity.ok(e));
                })
                .onErrorResume(e -> Mono.just(ResponseEntity.status(HttpStatus.BAD_REQUEST).build()));
    }
}
