package com.example.trelloApi.service.token;

import com.example.trelloApi.configs.security.UserDetails;


public interface TokenService {

    String generateToken(UserDetails userDetails);

    Boolean isValid(String token);


}
