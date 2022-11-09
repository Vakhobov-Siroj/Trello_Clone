package com.example.trelloApi.utils.jwt;

import com.example.trelloApi.service.token.AccessTokenService;
import com.example.trelloApi.service.token.RefreshTokenService;




// TODO: 8/20/22 we wanted it to be factory for token services
public class JwtUtils {
    public static final AccessTokenService accessTokenService = new AccessTokenService();
    public static final RefreshTokenService refreshTokenService = new RefreshTokenService();
}
