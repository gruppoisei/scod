package com.isei.scod.Controller;

import com.isei.scod.DTO.AnpePersonaDTO;
import com.isei.scod.Exception.NotFoundException;
import com.isei.scod.Service.AnpePersonaService;
import jakarta.validation.ConstraintViolationException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/anpePersona")
public class AnpePersonaController {

    @Autowired
    AnpePersonaService anpePersonaService;

    @PostMapping("/saveAnpePersona")
    public ResponseEntity<Boolean> saveAnpePersona(@RequestBody AnpePersonaDTO dto) {

        try {

            return ResponseEntity.ok(anpePersonaService.saveAnpePersona(dto));

        } catch (ConstraintViolationException e) {

            e.printStackTrace();
            return ResponseEntity.badRequest().build();

        } catch (Exception e) {

            e.printStackTrace();
            return ResponseEntity.internalServerError().body(false);

        }
    }

    @GetMapping("/getAnpePersona/{id}")
    public ResponseEntity<AnpePersonaDTO> getAnpePersonaById(@PathVariable(value = "id") Integer id) {

        try {

            return ResponseEntity.ok(anpePersonaService.getAnpePersonaById(id));

        } catch (NotFoundException e) {

            e.printStackTrace();
            return ResponseEntity.notFound().build();

        } catch (Exception e) {

            e.printStackTrace();
            return ResponseEntity.internalServerError().build();

        }
    }
}
