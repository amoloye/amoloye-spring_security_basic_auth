package org.example.trotrosecurity.service;

import org.example.trotrosecurity.dto.JwtAuthenticationResponse;
import org.example.trotrosecurity.dto.RefreshTokenRequest;
import org.example.trotrosecurity.dto.SignUpRequest;
import org.example.trotrosecurity.dto.SigninRequest;
import org.example.trotrosecurity.entity.User;

public interface AuthenticationService {

    User signup(SignUpRequest signUpRequest);

    JwtAuthenticationResponse signin (SigninRequest signinRequest);

    JwtAuthenticationResponse refreshToken(RefreshTokenRequest refreshTokenRequest);
}
