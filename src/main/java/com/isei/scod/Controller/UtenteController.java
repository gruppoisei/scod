package com.isei.scod.Controller;

import com.isei.scod.DTO.RegisterDTO;
import com.isei.scod.Service.UtenteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class UtenteController {

    @Autowired
    UtenteService utenteService;

    @PostMapping("/register")
    public ResponseEntity<String> registerNewUser(@RequestBody RegisterDTO register) {
        try {
            utenteService.registerUser(register);
            return ResponseEntity.ok("ok");
        }  catch (Exception e) {
            e.printStackTrace();
            return  ResponseEntity.internalServerError().body(e.getMessage());
        }
    }

    @GetMapping("/welcome")
    public String getWelcomePage() {
        SecurityContext context =  SecurityContextHolder.getContext();
        String username = (context.getAuthentication().getName());
        return "hello, " + username;
    }

}
