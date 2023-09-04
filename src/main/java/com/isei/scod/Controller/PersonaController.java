package com.isei.scod.Controller;

import com.isei.scod.DTO.PersonaDTO;
import com.isei.scod.DTO.PersonaLoginDTO;
import com.isei.scod.DTO.RuoloDTO;
import com.isei.scod.DTO.RuoloPersonaDTO;
import com.isei.scod.Exception.NotFoundException;
import com.isei.scod.Service.PersonaService;
import com.isei.scod.Service.RuoloPersonaService;
import com.isei.scod.Service.RuoloService;
import jakarta.validation.ConstraintViolationException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/persona")
public class PersonaController {

    @Autowired
    PersonaService personaService;

    @Autowired
    RuoloPersonaService ruoloPersonaService;

    @Autowired
    RuoloService ruoloService;

    @PostMapping("/savePersona")
    public ResponseEntity<Boolean> savePersona(@RequestBody PersonaDTO dto) {

        try {

            return ResponseEntity.ok(personaService.saveAnpePersona(dto));

        } catch (ConstraintViolationException e) {

            e.printStackTrace();
            return ResponseEntity.badRequest().build();

        } catch (Exception e) {

            e.printStackTrace();
            return ResponseEntity.internalServerError().body(false);

        }
    }

    @GetMapping("/getPersonaLogin/{id}")
    public ResponseEntity<PersonaLoginDTO> getPersonaLoginDTOById(@PathVariable(value = "id") Integer id) {

        try {

            return ResponseEntity.ok(personaService.getPersonaLoginDTOById(id));

        } catch (NotFoundException e) {

            e.printStackTrace();
            return ResponseEntity.notFound().build();

        } catch (Exception e) {

            e.printStackTrace();
            return ResponseEntity.internalServerError().build();

        }
    }

    @GetMapping("/getPersona/{id}")
    public ResponseEntity<PersonaDTO> getPersonaDTOById(@PathVariable(value = "id") Integer id) {

        try {

            return ResponseEntity.ok(personaService.getPersonaDTOById(id));

        } catch (NotFoundException e) {

            e.printStackTrace();
            return ResponseEntity.notFound().build();

        } catch (Exception e) {

            e.printStackTrace();
            return ResponseEntity.internalServerError().build();

        }
    }

    @GetMapping("/getRuoloPersona/{id}")
    public ResponseEntity<RuoloPersonaDTO> getRuoloPersonaById(@PathVariable(value = "id") Integer id) {

        try {

            return ResponseEntity.ok(ruoloPersonaService.getAnrpRuoloPersonaById(id));

        } catch (NotFoundException e) {

            e.printStackTrace();
            return ResponseEntity.notFound().build();

        } catch (Exception e) {

            e.printStackTrace();
            return ResponseEntity.internalServerError().build();

        }
    }

    @GetMapping("/getRuoloById/{id}")
    public ResponseEntity<RuoloDTO> getRuoloById(@PathVariable(value = "id") Integer id) {

        try {

            return ResponseEntity.ok(ruoloService.getAnruRuoloById(id));

        } catch (NotFoundException e) {

            e.printStackTrace();
            return ResponseEntity.notFound().build();

        } catch (Exception e) {

            e.printStackTrace();
            return ResponseEntity.internalServerError().build();

        }
    }
}
