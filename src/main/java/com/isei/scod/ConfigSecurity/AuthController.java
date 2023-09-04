package com.isei.scod.ConfigSecurity;

import com.isei.scod.DTO.LoginResponseDTO;
import com.isei.scod.Entity.SyutUtente;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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
        LoginResponseDTO refreshResponse = new LoginResponseDTO();
       if(!tokenService.authToken(authentication,refToken)) {
           return null;
       }
        String token = tokenService.generateToken(authentication);
        refreshResponse.withUserName(authentication.getName()).withToken(token).withExpirationTime(30*60*1000).withUserId(1);
        return refreshResponse;
    }

    @PostMapping("/token")
    public LoginResponseDTO token(Authentication authentication) {
        LoginResponseDTO loginResponse = new LoginResponseDTO();
        LOG.info("Token requested for user: '{}'", authentication.getName());
        String token = tokenService.generateToken(authentication);
        String refreshToken = tokenService.generateRefreshToken(authentication);
        LOG.info("Token granted: {}", token);
        Integer userId = ((SyutUtente) authentication.getPrincipal()).getSyutFkPersPersonaid();
        loginResponse.withUserName(authentication.getName()).withToken(token).withExpirationTime(20*60*1000).withUserId(userId).withRefreshToken(refreshToken);
        return loginResponse;
    }

}
