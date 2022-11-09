package com.example.trelloApi.mappers.auth;

import com.example.trelloApi.domains.auth.AuthUser;
import com.example.trelloApi.dto.auth.UserDto;
import org.mapstruct.Mapper;




@Mapper(componentModel = "spring")
public interface UserMapper {

    UserDto fromUser(AuthUser authUser);
}
