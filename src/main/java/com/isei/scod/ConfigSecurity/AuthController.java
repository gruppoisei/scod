package com.isei.scod.ConfigSecurity;

import com.isei.scod.DTO.LoginResponseDTO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.*;

@RestController
public class AuthController {

    private static final Logger LOG = LoggerFactory.getLogger(AuthController.class);

    private final TokenService tokenService;

    public AuthController(TokenService tokenService) {
        this.tokenService = tokenService;
    }


    @PostMapping("/refresh")
    public LoginResponseDTO refreshToken( Authentication authentication,@RequestBody String refToken) {
        LoginResponseDTO authResp = new LoginResponseDTO();
       if(!tokenService.authToken(authentication,refToken)){
           return null;
       }
        authResp = token(authentication);
        return authResp;
    }

    @PostMapping("/token")
    public LoginResponseDTO token(Authentication authentication) {
        LoginResponseDTO loginResponse = new LoginResponseDTO();
        LOG.info("Token requested for user: '{}'", authentication.getName());
        String token = tokenService.generateToken(authentication);
        String refreshToken = tokenService.generateRefreshToken(authentication);
        LOG.info("Token granted: {}", token);
        loginResponse.withUserName(authentication.getName()).withToken(token).withExpirationTime(3600).withUserId(1).withRefreshToken(refreshToken);
        return loginResponse;
    }

}
