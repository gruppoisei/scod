package com.isei.scod.Controller;

import com.isei.scod.DTO.AnrpRuoloPersonaDTO;
import com.isei.scod.Exception.NotFoundException;
import com.isei.scod.Service.AnrpRuoloPersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ruoloPersona")
public class AnrpRuoloPersonaConroller {

    @Autowired
    AnrpRuoloPersonaService anrpRuoloPersonaService;

    @GetMapping("/getRuoloPersona/{id}")
    public ResponseEntity<AnrpRuoloPersonaDTO> getRuoloPersonaById(@PathVariable(value = "id") Integer id) {

        try {

            return ResponseEntity.ok(anrpRuoloPersonaService.getAnrpRuoloPersonaById(id));

        } catch (NotFoundException e) {

            e.printStackTrace();
            return ResponseEntity.notFound().build();

        } catch (Exception e) {

            e.printStackTrace();
            return ResponseEntity.internalServerError().build();

        }
    }
}
