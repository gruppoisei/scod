package com.isei.scod.Controller;

import com.isei.scod.DTO.PersonaDTO;
import com.isei.scod.DTO.PersonaAnagraficaDTO;
import com.isei.scod.DTO.RuoloDTO;
import com.isei.scod.DTO.RuoloPersonaDTO;
import com.isei.scod.Exception.NotFoundException;
import com.isei.scod.Service.PersonaService;
import com.isei.scod.Service.RuoloPersonaService;
import com.isei.scod.Service.RuoloService;
import jakarta.validation.ConstraintViolationException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@RestController
@RequestMapping("/persona")
public class PersonaController {

    @Autowired
    PersonaService personaService;

    @Autowired
    RuoloPersonaService ruoloPersonaService;

    @Autowired
    RuoloService ruoloService;

    @PostMapping(value = "/savePersona", consumes = { MediaType.APPLICATION_JSON_VALUE,MediaType.MULTIPART_FORM_DATA_VALUE })
    public ResponseEntity<Boolean> savePersona(@RequestPart("persona") String persona, @RequestPart("file") List<MultipartFile> file) {

        try {

            return ResponseEntity.ok(personaService.convertAndSavePersonaDTO(persona, file));

        } catch (ConstraintViolationException e) {

            e.printStackTrace();
            return ResponseEntity.badRequest().build();

        } catch (Exception e) {

            e.printStackTrace();
            return ResponseEntity.internalServerError().body(false);

        }
    }

    @GetMapping("/getPersonaLogin/{id}")
    public ResponseEntity<PersonaAnagraficaDTO> getPersonaAnagraficaDTOById(@PathVariable(value = "id") Integer id) {

        try {

            return ResponseEntity.ok(personaService.getPersonaAnagraficaDTOById(id));

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
