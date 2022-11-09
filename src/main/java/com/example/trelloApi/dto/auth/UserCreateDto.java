package com.example.trelloApi.dto.auth;

import com.example.trelloApi.dto.base.BaseGenericDto;

import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;




public record UserCreateDto(String email, String password) implements BaseGenericDto {
}
