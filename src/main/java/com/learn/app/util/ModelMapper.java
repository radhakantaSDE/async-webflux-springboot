package com.learn.app.util;

import com.learn.app.model.dto.UserDto;
import com.learn.app.model.entity.UserEntity;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class ModelMapper {

    public static UserEntity toUserEntity(@NonNull UserDto userDto) {

        return UserEntity.builder().name(userDto.getName()).email(userDto.getEmail()).mobile(userDto.getMobile()).build();
    }

    public static UserDto toUserDto(@NonNull UserEntity userEntity) {

        return UserDto.builder().id(userEntity.getId()).name(userEntity.getName()).email(userEntity.getEmail()).mobile(userEntity.getMobile()).build();
    }
}
