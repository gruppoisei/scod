package com.isei.scod.Controller;

import com.isei.scod.DTO.RegisterUserDTO;
import com.isei.scod.DTO.RegisterUserPersonaDTO;
import com.isei.scod.Service.UtenteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.*;


@RestController
public class UtenteController {

    @Autowired
    UtenteService utenteService;

    @PostMapping("/registerUser")
    public ResponseEntity<Boolean> registerNewUser(@RequestBody RegisterUserDTO register) {
        try {
            utenteService.registerUser(register);
            return ResponseEntity.ok(true);
        }  catch (Exception e) {
            e.printStackTrace();
            return  ResponseEntity.internalServerError().body(false);
        }
    }

    @PostMapping("/registerUserPersona")
    public ResponseEntity<Boolean> registerNewUserAndPerson(@RequestBody RegisterUserPersonaDTO register) {
        try {
            utenteService.registerUserPersona(register);
            return ResponseEntity.ok(true);
        }  catch (Exception e) {
            e.printStackTrace();
            return  ResponseEntity.internalServerError().body(false);
        }
    }

    @GetMapping("/disattivaUtentePersona/{id}")
    public ResponseEntity<Boolean> disattivaUtentePersona(@PathVariable("id") Integer id) {
        try {
            utenteService.disattivaUtentePersona(id);
            return ResponseEntity.ok(true);
        }  catch (Exception e) {
            e.printStackTrace();
            return  ResponseEntity.internalServerError().body(false);
        }
    }

    @GetMapping("/welcome")
    public String getWelcomePage() {
        SecurityContext context =  SecurityContextHolder.getContext();
        String username = (context.getAuthentication().getName());
        return "hello, " + username;
    }

}
