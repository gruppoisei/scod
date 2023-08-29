package com.isei.scod.Controller;


import com.isei.scod.DTO.SocietaDTO;
import com.isei.scod.DTO.TipoSocietaDTO;
import com.isei.scod.Exception.NotFoundException;
import com.isei.scod.Service.SocietaService;
import jakarta.validation.ConstraintViolationException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/societa")
public class SocietaController {

    @Autowired
    SocietaService societaService;


    @PostMapping("/saveAnsoSocieta")
    public ResponseEntity<Boolean> saveAnsoSocieta(@RequestBody SocietaDTO dto) {

        try {

            return ResponseEntity.ok(societaService.saveAnsoSocieta(dto));

        } catch (ConstraintViolationException e) {

            e.printStackTrace();
            return ResponseEntity.badRequest().build();

        } catch (Exception e) {

            e.printStackTrace();
            return ResponseEntity.internalServerError().body(false);

        }
    }

    @GetMapping("/getAnsoSocieta/{id}")
    public ResponseEntity<SocietaDTO> getAnsoSocietaById(@PathVariable(value = "id") Integer id) {

        try {

            return ResponseEntity.ok(societaService.getAnsoSocietaById(id));

        } catch (NotFoundException e) {

            e.printStackTrace();
            return ResponseEntity.notFound().build();

        } catch (Exception e) {

            e.printStackTrace();
            return ResponseEntity.internalServerError().build();

        }
    }

    @GetMapping("/getTipoSocieta/{id}")
    public ResponseEntity<TipoSocietaDTO> getTipoSocietaById(@PathVariable(value = "id") Integer id) {

        try {

            return ResponseEntity.ok(societaService.getTipoSocietaById(id));

        } catch (NotFoundException e) {

            e.printStackTrace();
            return ResponseEntity.notFound().build();

        } catch (Exception e) {

            e.printStackTrace();
            return ResponseEntity.internalServerError().build();

        }
    }
}
