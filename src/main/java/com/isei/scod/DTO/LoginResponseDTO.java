package com.isei.scod.DTO;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class LoginResponseDTO {

   public String userName;

   public Integer userId;

   public String token;

   public Integer expiresIn;

   public String refreshToken;

   public LoginResponseDTO withUserName(String userName){
       this.userName = userName;
       return this;
   }

    public LoginResponseDTO withUserId(Integer userId){
        this.userId = userId;
        return this;
    }

    public LoginResponseDTO withToken(String token){
        this.token = token;
        return this;
    }

    public LoginResponseDTO withExpirationTime(Integer expiresIn){
        this.expiresIn = expiresIn;
        return this;
    }

    public LoginResponseDTO withRefreshToken(String refreshToken){
        this.refreshToken = refreshToken;
        return this;
    }

}
