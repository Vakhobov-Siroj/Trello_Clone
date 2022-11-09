package com.example.trelloApi.dto.jwt;


public record JwtResponseDto(
        String accessToken,
        String refreshToken,
        String tokenType) {
}
